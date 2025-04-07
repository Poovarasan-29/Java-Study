import java.util.Scanner;

public class intArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = in.nextInt();
        int array[] = new int[size];

        System.out.print("\nEnter the Interger values only\n");
        for (int i = 0; i < size; i++) {
            System.out.println();
            System.out.print((i + 1) + " value : ");
            array[i] = in.nextInt();
        }

        System.out.println("Array Values");
        for (int a : array) {
            System.out.print(" " + a);
        }

        in.close();
    }
}