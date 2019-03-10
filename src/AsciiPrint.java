import java.util.Scanner;

public class AsciiPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char beg = (char)Integer.parseInt(scanner.nextLine());
        char end =(char) Integer.parseInt(scanner.nextLine());

        for(char i = beg; i<=end; i++){
            System.out.print(i + " ");
        }
    }
}
