import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        ArrayList<Integer> list = Arrays.stream(number.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
        String input = scanner.nextLine().toLowerCase();
        while(!input.equals("end")){
            String[] split = input.split(" ");
            if(split[0].equals("delete")){
                int num = Integer.parseInt(split[1]);
                list = list.stream()
                        .filter(e -> !e.equals(num))
                        .collect(Collectors.toCollection(ArrayList::new));
            }
            else if(split[0].equals("insert")){
                int num = Integer.parseInt(split[1]);
                int index = Integer.parseInt(split[2]);
                if (index >= 0 && index<list.size()) {
                    list.add(index, num);
                }
            }
            input = scanner.nextLine().toLowerCase();
        }
        for(int num: list){
            System.out.print(num + " ");
        }
    }
}
