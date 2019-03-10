import java.util.Scanner;

public class Ex2Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        System.out.println(count(str));
    }
    public static int count(String str){
        int count = 0;
        for(int i=0; i<str.length();i++){
            switch(str.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }
}
