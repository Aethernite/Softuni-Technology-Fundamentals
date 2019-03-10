import java.util.Scanner;

public class Ex3CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        print(a,b);
    }

    public static void print(char a, char b){
        if((int)a > (int)b){
            for(char i = ++b; i<a; i++){
                System.out.print(i + " ");
            }
        }
        else {
            for (char i = ++a; i < b; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
