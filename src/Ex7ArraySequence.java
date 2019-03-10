
import java.util.Scanner;


public class Ex7ArraySequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] input = str.split(" ");
        int size = input.length;
        int[] array = new int[size];
        for(int i = 0; i< size ; i++){
            array[i] = Integer.parseInt(input[i]);
        }
        int lonSequence = 1;
        int curSequence = 1;
        int numToRepeat = 0;
        for(int i = 0; i <= array.length-1; i++){
          try {
              if (array[i] == array[i + 1]) {
                  curSequence++;
                  continue;
              }
          }catch(Exception e){}

              if (curSequence > lonSequence) {
                  lonSequence = curSequence;
                  numToRepeat = array[i];
              }
            curSequence = 1;
        }

        for(int i = 0; i<lonSequence; i++){
            System.out.print(numToRepeat + " ");
        }


    }
}
