import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int powerOriginal = power;
        int distance = Integer.parseInt(scanner.nextLine());
        int exFactor = Integer.parseInt(scanner.nextLine());
        int pokeCount = 0;
        while(power>=distance){
            power-=distance;
            pokeCount++;
            if(power == (double)powerOriginal/2){
                if(exFactor > 0) {
                    power /= exFactor;
                }
            }
        }
        System.out.println(power);
        System.out.print(pokeCount);
    }
}
