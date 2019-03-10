import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sumGiven = 0;

        while (!"Start".equals(input)) {
            double moneyInput = Double.parseDouble(input);

            if (moneyInput == 0.1 || moneyInput == 0.2 || moneyInput == 0.5 || moneyInput == 1 || moneyInput == 2) {
                sumGiven += moneyInput;
            } else {
                System.out.printf("Cannot accept %.2f", moneyInput);
            }

            input = scanner.nextLine();
        }
    }
}
