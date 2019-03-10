import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int counterHeadsetCrash = 0;
        int counterMouseCrash = 0;
        int counterKeyboardCrash = 0;
        int counterDisplayCrash = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                counterKeyboardCrash++;
                counterMouseCrash++;
                counterHeadsetCrash++;
            }
            else if (i % 2 == 0) {
                counterHeadsetCrash++;
            }
           else if (i % 3 == 0) {
                counterMouseCrash++;
            }

        }
        counterDisplayCrash = counterKeyboardCrash/2;
        double totalPrice = counterMouseCrash * mousePrice + counterHeadsetCrash * headsetPrice + counterKeyboardCrash * keyboardPrice +
                counterDisplayCrash * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}