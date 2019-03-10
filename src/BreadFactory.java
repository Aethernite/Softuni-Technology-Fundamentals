import java.util.Scanner;

public class BreadFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] commands = input.split("\\|");
        String[] event;
        int energy = 100;
        int coins = 100;


        for(int i=0; i<commands.length; i++){
            event = commands[i].split("-");

            switch(event[0]){
                case "rest":
                    int energyToGain = Integer.parseInt(event[1]);
                    int energyGained;
                    if(energy+energyToGain>100){
                        energyGained = energyToGain - (energy+energyToGain-100);
                        energy = 100;
                        System.out.printf("You gained %d energy.%n", energyGained);
                        System.out.printf("Current energy: %d.%n", energy);
                    }
                    else{
                        System.out.printf("You gained %d energy.%n", energyToGain);
                        energy+=energyToGain;
                        System.out.printf("Current energy: %d.%n", energy);
                    }
                    break;

                case "order":
                    if(energy-30<0){
                        System.out.println("You had to rest!");
                        energy+=50;
                    }
                    else{
                        coins+= Integer.parseInt(event[1]);
                        System.out.printf("You earned %d coins.%n", Integer.parseInt(event[1]));
                        energy-=30;
                    }
                    break;
                default:
                    coins-= Integer.parseInt(event[1]);
                    if(coins<=0){
                        System.out.printf("Closed! Cannot afford %s.%n", event[0]);
                        return;
                    }
                    else{
                        System.out.printf("You bought %s.%n", event[0]);
                    }
                    break;
            }

        }
        System.out.println("Day completed!");
        System.out.println("Coins: " + coins);
        System.out.println("Energy: " + energy);


    }
}
