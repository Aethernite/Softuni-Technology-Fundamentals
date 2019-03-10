import java.util.ArrayList;
import java.util.Scanner;

public class Ex5TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        ArrayList<String> arrl = new ArrayList<String>();

        for(int i = 0; i<arr.length; i++){
            boolean topInt = true;
            for(int w = i; w<arr.length; w++){
                if(Integer.parseInt(arr[i]) < Integer.parseInt(arr[w])){
                    topInt = false;
                }
            }
            if(topInt && !(arrl.contains(arr[i]))){
                arrl.add(arr[i]);
            }
        }


        for(String ob: arrl){
            System.out.print(ob + " ");
        }
    }
}
