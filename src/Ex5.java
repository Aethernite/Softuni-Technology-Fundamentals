import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String password = new StringBuffer(user).reverse().toString();
        int tries = 0;

        while(true){
            String input = scanner.nextLine();
            if(input.equals(password)){
                System.out.println("User " + user +" logged in.");
                return;
            }
            else{
                tries++;
                if(tries==4){
                    System.out.println("User " + user +" blocked!");
                    return;
                }
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
