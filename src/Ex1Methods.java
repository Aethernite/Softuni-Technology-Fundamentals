import java.util.Scanner;

public class Ex1Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i=0; i<3;i++){
            nums[i] = Integer.parseInt(scanner.nextLine());
        }
        print(nums);


    }

    public static void print(int[] arr){
        int smallest = arr[0];
        for(int i=0; i<3; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
