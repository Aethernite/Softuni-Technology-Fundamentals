import java.util.Scanner;

public class Ex9PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine();
            if(input.toLowerCase().equals("end")){
                break;
            }
            int num = Integer.parseInt(input);
            System.out.println(palindrome(num));
        }
    }

    public static boolean palindrome(int num){
        int n = num;
        int digit;
        int rev = 0;
        do{
            digit = num%10;
            rev = (rev*10) + digit;
            num = num/10;
        } while(num !=0);

        if(n==rev){
            return true;
        }
        else{
            return false;
        }
    }
}
