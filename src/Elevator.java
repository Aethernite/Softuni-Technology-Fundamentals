import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        if(people%capacity == 0 && people > capacity){
            System.out.println(people/capacity);
        }
        else if(people<capacity){
            System.out.println(1);
        }
        else{
            System.out.println(people/capacity + 1);
        }
    }
}
