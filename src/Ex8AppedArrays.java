import java.util.*;
import java.util.stream.Collectors;

public class Ex8AppedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] stringArr = input.split("[\\\\|]");

        for(int i = stringArr.length-1; i>=0; i--){
            String[] arr = stringArr[i].split("\\s+");
            for(int q = 0; q<arr.length; q++){
                if(!(arr[q].equals(" ") || arr[q].equals(""))) {
                    System.out.print(arr[q] + " ");
                }
            }
        }
    }
}
