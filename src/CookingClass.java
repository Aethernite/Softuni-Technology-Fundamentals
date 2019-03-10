import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CookingClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("#.##");
        //1 flour 10 eggs 1 apron 20% more aprons ceil next integer 5th package of flour is free


        double sum = students * (flourPrice + 10*eggPrice + apronPrice);
        sum-=(students/5) * flourPrice;
        sum+= Math.ceil(students*0.2) * apronPrice;

        if(budget>=sum){
            System.out.printf("Items purchased for %.2f$.", sum);
        } else{
            System.out.printf("%.2f$ more needed.", sum-budget);
        }
    }
}
