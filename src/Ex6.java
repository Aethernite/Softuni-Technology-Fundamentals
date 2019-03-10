import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int result = 0;
        int numbers = num.length();
        for(int i = 0; i< numbers; i++){
            result += check(num.charAt(i) - 48);
        }

        if(result == Integer.parseInt(num)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }

    static int check(int num){
        int result;
        if(num==0 || num==1) {
            return 1;
        }
        result = check(num-1) * num;
        return result;
    }
}
