import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long yield = Integer.parseInt(scanner.nextLine());
        long gained = 0;
        long days = 0;
        if (yield >= 100) {
            do {
                long extracted = yield;
                days++;
                yield -= 10;
                gained += extracted - 26;
            } while (yield >= 100);
            gained -= 26;
            System.out.printf("%d%n%d", days, gained);
        }
        else {
            System.out.printf("%d%n%d", 0, 0);
        }
    }
}

