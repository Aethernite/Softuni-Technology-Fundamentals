import java.util.Scanner;

public class Ex10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        print(n);
    }
 public static void print(int n){

        for(int i = 0; i<=n; i++){
         if(sumOfDigits(i) % 8 == 0){
           if(holdOddDigit(i)){
               System.out.println(i);
           }
         }
        }
 }



public static int sumOfDigits(int num){
int sum = 0;
    while (num > 0) {
        sum = sum + num % 10;
        num = num / 10;
    }
    return sum;
}

public static boolean holdOddDigit(int num){
        int digit;
        while(num > 0){
            digit = num % 10;
            if(!(digit%2==0)){
                return true;
            }
            num = num/10;
        }
        return false;
}

}
