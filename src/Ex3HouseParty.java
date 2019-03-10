import java.util.ArrayList;
import java.util.Scanner;

public class Ex3HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<n; i++){
            String input = scanner.nextLine();
            if(input.matches("[A-Za-z]+ is going!")){
                String[] split = input.split(" ");
                if(!check(split[0], list)){
                    list.add(split[0]);
                }
                else{
                    System.out.println(split[0] + " is already in the list!");
                }
            }
            else if(input.matches("[A-Za-z]+ is not going!")){
                String[] split = input.split(" ");
                if(check(split[0],list)){
                    for(String name: list){
                        if(name.equals(split[0])){
                            list.remove(name);
                            break;
                        }
                    }
                }
                else{
                    System.out.println(split[0] + " is not in the list!");
                }
            }
        }
        for(String name: list){
            System.out.println(name);
        }
    }
    public static boolean check(String str, ArrayList<String> list){
        for(String name: list){
            if(name.equals(str)){
                return true;
            }
        }
        return false;
    }
}
