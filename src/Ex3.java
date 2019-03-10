import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double pricePerPerson = 0;
        double totalPrice = 0;
        switch(day){
            case "Friday":
                switch(typeGroup){
                    case "Regular":
                        pricePerPerson = 15;
                        break;
                    case "Business":
                        pricePerPerson = 10.90;
                        break;
                    case "Students":
                        pricePerPerson = 8.45;
                        break;
                }
                break;
            case "Saturday":
                switch(typeGroup){
                    case "Regular":
                        pricePerPerson = 20;
                        break;
                    case "Business":
                        pricePerPerson = 15.60;
                        break;
                    case "Students":
                        pricePerPerson = 9.80;
                        break;
                }
                break;
            case "Sunday":
                switch(typeGroup){
                    case "Regular":
                        pricePerPerson = 22.50;
                        break;
                    case "Business":
                        pricePerPerson = 16;
                        break;
                    case "Students":
                        pricePerPerson = 10.46;
                        break;
                }
                break;
        }
        totalPrice = people * pricePerPerson;

        switch(typeGroup){
            case "Regular":
                if(people >= 10 && people<=20){
                    totalPrice -= totalPrice * 0.05;
                }
                break;
            case "Business":
                if(people >= 100){
                    totalPrice -= 10 * pricePerPerson;
                }
                break;
            case "Students":
                if(people >= 30){
                    totalPrice -= totalPrice * 0.15;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
