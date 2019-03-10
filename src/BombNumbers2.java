import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] numSplit = scanner.nextLine().split(" ");
        int bombNum = Integer.parseInt(numSplit[0]);
        int power = Integer.parseInt(numSplit[1]);
        ArrayList<Integer> list = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Integer> list2 = detonate(list, bombNum, power);
        int sum = 0;
        for(int num: list2){
            sum += num;
        }
        System.out.println(sum);

    }

    public static ArrayList detonate(ArrayList<Integer> list, int bombNumber, int power){
       if(!(contains(list,bombNumber))){
           return list;
       }
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == bombNumber){
                int start = i - power;
                if(start<0){
                    start=0;
                }
                int finish = i+power;
                if(finish>list.size()-1){
                    finish = list.size();
                }
                for(int q = start; q <= finish; q++){
                    list.set(q, 0);
                }
            }
        }
        detonate(list,bombNumber,power);
    return list;
    }

    private static boolean contains(ArrayList<Integer> list, int bombNumber){
    for(int i=0; i<list.size(); i++){
        if(list.get(i) == bombNumber){
            return true;
        }
    }
    return false;
}
}
