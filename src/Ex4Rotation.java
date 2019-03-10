import java.util.Scanner;

public class Ex4Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        int w = 0;
        for(int i = 0; i<n; i++){
            arr = shift(arr);
        }

        for(String ob: arr) {
            System.out.print(ob + " ");
        }
    }
    public static String[] shift(String[] arr){
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


