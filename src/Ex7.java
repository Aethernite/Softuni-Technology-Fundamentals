
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = 0.00;
        NumberFormat formatter = new DecimalFormat("#0.00");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("Start")){
                while(true){
                    input = scanner.nextLine();
                    if(input.equals("End")){
                          System.out.printf("Change: %s", formatter.format(budget));
                          return;
                    }
                    switch(input){
                        case "Nuts":
                            if(budget-2<0){
                                System.out.println("Sorry, not enough money");
                            } else {
                                System.out.println("Purchased Nuts");
                                budget -= 2;
                            }
                            break;
                        case "Water":
                            if(budget-0.7<0){
                                System.out.println("Sorry, not enough money");
                            } else {
                                System.out.println("Purchased Water");
                                budget -= 0.7;
                            }
                            break;
                        case "Crisps":
                            if(budget-1.5<0){
                                System.out.println("Sorry, not enough money");
                            } else {
                                System.out.println("Purchased Crisps");
                                budget -= 1.5;
                            }
                            break;
                        case "Soda":
                            if(budget-0.8<0){
                                System.out.println("Sorry, not enough money");
                            } else {
                                System.out.println("Purchased Soda");
                                budget -= 0.8;
                            }
                            break;
                        case "Coke":
                            if(budget-1<0){
                                System.out.println("Sorry, not enough money");
                            } else {
                                System.out.println("Purchased Coke");
                                budget -= 1;
                            }
                            break;
                        default:
                            System.out.println("Invalid product");
                            break;
                    }
                }
            }
            switch(input){
                case "0.1":
                    budget += 0.1;
                    break;
                case "0.2":
                    budget += 0.2;
                    break;
                case "0.5":
                    budget += 0.5;
                    break;
                case "1":
                    budget += 1;
                    break;
                case "2":
                    budget +=2;
                    break;
                default:
                    System.out.printf("Cannot accept %.2f%n", Double.parseDouble(input));
                    break;

            }
        }
    }
}
