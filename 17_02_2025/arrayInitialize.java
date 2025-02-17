import java.util.Scanner;

public class arrayInitialize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = in.nextInt();
        int nums[] = new int[size];
        System.out.print("\nEnter Values : ");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        System.out.print("\nUsing Normal Loop : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.print("\nUsing ForEach Loop : ");
        for (int n : nums) {
            System.out.print(n + " ");

        }

        System.out.print("\nReverse the Loop");
        System.out.print("\nUsing Normal Loop : ");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        in.close();
    }
}
