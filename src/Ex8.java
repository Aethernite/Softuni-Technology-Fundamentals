import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int end = 1;
        while(true) {
            for (int i = 0; i < end; i++){
                System.out.print(end + " ");
            }
            System.out.println();
            end++;
            if(end>num){
                break;
            }
        }
    }
}
