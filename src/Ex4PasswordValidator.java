import java.util.Scanner;

public class Ex4PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        check(input);
    }
    public static void check(String input){
        boolean valid = true;
        if(input.length() < 6 || input.length()>10) {
            System.out.println("Password must be between 6 and 10 characters");
            valid = false;
        }
        for(int i = 0; i<input.length(); i++){
                if(!(Character.isLetter(input.charAt(i))) && !(Character.isDigit(input.charAt(i)))){
                    System.out.println("Password must consist only of letters and digits");
                    valid = false;
                    break;
                }
        }
        int digitCount = 0;
        for(int i = 0; i<input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
                digitCount++;
            }
        }
        if(digitCount<2){
            System.out.println("Password must have at least 2 digits");
            valid = false;
        }
        if(valid) {
            System.out.println("Password is valid");
        }

    }
}
