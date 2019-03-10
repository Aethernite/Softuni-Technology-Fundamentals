import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int divBy = 0;
        if(number%10 == 0){
            divBy = 10;
        }
        else if(number%7==0){
            divBy = 7;
        }
        else if(number%6==0){
            divBy = 6;
        }
        else if(number%3==0){
            divBy = 3;
        }
        else if(number%2==0){
            divBy = 2;
        }
        if(divBy == 0) {
            System.out.println("Not divisible");
        } else{
            System.out.println("The number is divisible by " + divBy);
        }

    }
}
