import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex4ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        ArrayList<Integer> list = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        while(true){
            String input = scanner.nextLine().toLowerCase();
            if(input.equals("end")){
                break;
            }
            String[] data = input.split(" ");
            int index;
            switch(data[0]) {
                case "add":
                    list.add(Integer.parseInt(data[1]));
                    break;
                case "insert":
                    index = Integer.parseInt(data[2]);
                    int num = Integer.parseInt(data[1]);
                    if(index>=0 && index<=list.size()){
                        list.add(index,num);
                    }
                    else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "remove":
                    index = Integer.parseInt(data[1]);
                    if(index>=0 && index<=list.size()){
                        list.remove(index);
                    }
                    else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "shift":
                    switch(data[1]){
                        case "left":
                            int count = Integer.parseInt(data[2]);
                            for(int i = 0; i<count; i++){
                                list = shiftLeft(list);
                            }
                            break;
                        case "right":
                            count = Integer.parseInt(data[2]);
                            for(int i = 0; i<count; i++){
                                list = shiftRight(list);
                            }
                            break;
                    }
            }
        }
        for(int num: list){
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> shiftLeft(ArrayList<Integer> arr){
        ArrayList<Integer> tempArray = (ArrayList<Integer>)arr.clone();
        for(int i = 0; i < arr.size(); i++){
            if(i < arr.size() - 1)
                tempArray.set(i, arr.get(i+1));
            else
                tempArray.set(i, arr.get(0));
        }
        return tempArray;
    }
    public static ArrayList<Integer> shiftRight(ArrayList<Integer> arr){
        ArrayList<Integer> tempArray = (ArrayList<Integer>)arr.clone();
        for(int i = 0; i < arr.size(); i++){
            if(i > 0)
                tempArray.set(i, arr.get(i-1));
            else
                tempArray.set(arr.size()-1, arr.get(0));
                tempArray.set(0,arr.get(arr.size()-1));
        }
        return tempArray;
    }
}
