import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int games = Integer.parseInt(scanner.nextLine());
        double headPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int headsetCount = 0;
        int keyboardCount = 0;
        int mouseCount = 0;
        int displayCount = 0;
        double total = 0;

        headsetCount = games/2;
        mouseCount = games/3;
        keyboardCount = (Math.max(headsetCount, mouseCount) - (Math.max(headsetCount, mouseCount) - Math.min(headsetCount, mouseCount)))/2;
        displayCount = keyboardCount/2;

        total = headsetCount * headPrice + mouseCount * mousePrice + keyboardCount * keyboardPrice + displayCount * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", total);

    }
}

