import java.util.Scanner;

public class LitersWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int litersMax = 255;
        int currentLiters = 0;
        for(int i = 0; i<n; i++){
            int input = Integer.parseInt(scanner.nextLine());
            if((currentLiters+input)>litersMax){
                System.out.println("Insufficient capacity!");
            }
            else{
                currentLiters+=input;
            }
        }
        System.out.println(currentLiters);
    }
}
