import java.util.Scanner;

public class Ex8FactorialDevis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        long fac1 = factorial(a);
        long fac2 = factorial(b);
        System.out.printf("%.2f", (double)fac1/(double)fac2);


    }
    public static long factorial(int n)
    {
        if (n >= 1)
            return n*factorial(n-1);
        else
            return 1;
    }
}
