import java.util.Scanner;

public class Ex3ArrayZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for(int i=0; i<n; i++){
            if(i%2==0) {
                arr2[i] = scanner.nextInt();
                arr[i] = scanner.nextInt();
            } else{
                arr[i] = scanner.nextInt();
                arr2[i] = scanner.nextInt();
            }
        }

        for(int i: arr2){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
