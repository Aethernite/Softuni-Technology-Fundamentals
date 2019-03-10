import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ammount = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());


        double total = (people+Math.ceil(people*0.1)) * saberPrice + (people-people/6) * beltsPrice + people * robesPrice;


        if(ammount - total == 0 || ammount - total > 0){
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else{
            System.out.printf("Ivan Cho will need %.2flv more.", Math.abs(ammount - total));
        }
    }
}
