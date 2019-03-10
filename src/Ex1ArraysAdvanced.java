import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex1ArraysAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        ArrayList<Integer> occupied = Arrays.stream(number.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
        int max = Integer.parseInt(scanner.nextLine());

        while(true){
         String input = scanner.nextLine().toLowerCase();
         if(input.equals("end")){
             break;
         }
         if(input.contains("add")){
             String[] split = input.split(" ");
             occupied.add(Integer.parseInt(split[1]));
         }
         else{
             int num = Integer.parseInt(input);
            for(int i = 0;i<occupied.size();i++){
                if(occupied.get(i) + num <= max){
                    occupied.set(i,occupied.get(i)+num);
                    break;
                }
            }
         }
        }
        for(int i: occupied){
            System.out.print(i + " ");
        }
    }
}
