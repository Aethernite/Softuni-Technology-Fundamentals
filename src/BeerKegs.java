import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String bigKeg = "";
        double bigVolume = 0;
        for(int i=0; i<num; i++){
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * radius * radius * (double)height;
            if(volume > bigVolume){
                bigKeg = model;
                bigVolume = volume;
            }
        }
        System.out.println(bigKeg);
    }
}
