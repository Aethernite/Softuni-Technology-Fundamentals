import java.util.Scanner;

public class Ex7Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        matrix(n);
    }

    public static void matrix(int n){
        for(int i = 0; i<n; i++){
            for(int q = 0; q<n; q++){
                System.out.print(n+ " ");
            }
            System.out.println();
        }
    }
}
