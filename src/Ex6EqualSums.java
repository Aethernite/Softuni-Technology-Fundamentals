import java.util.Scanner;

public class Ex6EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        for(int index = 0; index<arr.length; index++){
            if(leftSum(arr, index) == rightSum(arr, index)) {
                System.out.println(index);
                return;
            }
        }
        System.out.println("no");
    }

    public static int leftSum(String[] arr, int index){
        int sum = 0;
        if(index==0){
            return sum;
        }
        for(int i=0; i<index; i++){
            sum+= Integer.parseInt(arr[i]);
        }
        return sum;
    }
    public static int rightSum(String[] arr, int index){
        int sum = 0;
        if(index==arr.length-1){
            return sum;
        }
        for(int i=index+1; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }
}
