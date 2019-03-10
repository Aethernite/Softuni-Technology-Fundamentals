import java.util.ArrayList;
import java.util.Scanner;

public class Shifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i: list){
            System.out.print(i + " ");
        }
        for(int i = 0; i < 1; i++){
            list = shiftRight(list);
        }

        for(int i: list){
            System.out.print(i+ " ");
        }
    }
    public static ArrayList<Integer> shiftRight(ArrayList<Integer> arr){
        ArrayList<Integer> tempArray = new ArrayList<Integer>(arr.size());
        for(int i = 0 - 1; i < arr.size(); i++){
            if(i > 0)
                tempArray.set(i, arr.get(i-1));
            else
                tempArray.set(arr.size()-1, arr.get(0));
        }
        return tempArray;
    }
    public static String[] shiftLeft(String[] arr){
        String[] tempArray = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(i < arr.length - 1)
                tempArray[i] = arr[i + 1];
            else
                tempArray[i] = arr[0];
        }
        return tempArray;
    }
}
