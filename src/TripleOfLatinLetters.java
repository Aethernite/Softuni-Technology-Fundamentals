import java.util.Scanner;

public class TripleOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char first = (char) 'a';
        char second = (char) 'a';
        char third = (char) 'a';


        for(int i = 0; i<n; i++){
            first = (char)('a' + i);
            for(int w = 0; w<n; w++){
                second = (char)('a' + w);
                for(int q = 0; q<n; q++){
                    third = (char)('a' + q);
                    System.out.printf("%c%c%c%n",first,second,third);

                }
            }

        }
    }
}
