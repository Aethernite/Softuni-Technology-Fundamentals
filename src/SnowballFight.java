import java.math.BigInteger;
import java.util.Scanner;

public class SnowballFight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        BigInteger bestValue = BigInteger.valueOf(0);
        int bestTime = 0;
        int bestSnow = 0;
        int bestQuality = 0;
        for (int i = 0; i < N; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            BigInteger snowTime = BigInteger.valueOf(snow/time);
            BigInteger value = snowTime.pow(quality);

            if (value.compareTo(bestValue) > 0) {
                bestValue = value;
                bestSnow = snow;
                bestQuality = quality;
                bestTime = time;
            }
        }
        System.out.printf("%d : %d = %d (%d)", bestSnow, bestTime, bestValue, bestQuality);
    }
}
