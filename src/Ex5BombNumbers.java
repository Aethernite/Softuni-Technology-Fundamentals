import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex5BombNumbers {
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
        int indexBomb = contains(list,bombNumber);
        if(indexBomb == -1){
            return list;
        }
        if(indexBomb - power < 0 ){
            for(int i=0; i<indexBomb*2; i++){
                list.remove(i--);
            }
        }
        else{
            if(indexBomb+power<list.size()-1) {
                int boomCount = 0;
                for (int i = indexBomb - power; i < indexBomb + power; i++) {
                    if(boomCount<power*2+1) {
                        list.remove(i);
                        boomCount++;
                        i--;
                    }
                    else{
                        break;
                    }
                }
            }
            else{
                for(int i = indexBomb - power; i < list.size(); i++){
                    list.remove(i--);
                }
            }
        }
        detonate(list, bombNumber, power);
        return list;
    }
    public static int contains(ArrayList<Integer> list, int bombNumber){
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == bombNumber){
                return i;
            }
        }
        return -1;
    }
}
