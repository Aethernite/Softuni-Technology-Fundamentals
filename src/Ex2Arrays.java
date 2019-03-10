import java.util.Scanner;

public class Ex2Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        int n = arr.length;
        int w = arr2.length;



        for(String ob1: arr2){
            for(String ob2: arr){
                if(ob1.equals(ob2)){
                    System.out.print(ob1 + " ");
                }
            }
        }
    }
}
