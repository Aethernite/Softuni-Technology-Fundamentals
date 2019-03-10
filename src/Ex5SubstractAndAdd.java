import java.util.Scanner;

public class Ex5SubstractAndAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(sub(sum(a,b),c));
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sub(int sum, int c){
        return sum-c;
    }
}
