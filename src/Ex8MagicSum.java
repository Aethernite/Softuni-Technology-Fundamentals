import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex8MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] input = str.split(" ");
        int size = input.length;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        int num = Integer.parseInt(scanner.nextLine());
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < size; i++) {
            for (int q = 0; q < size; q++) {
                if (i < q && num == (array[i] + array[q])){
                    System.out.println(array[i] +  " "  + array[q]);
                }
            }


        }
    }
}


