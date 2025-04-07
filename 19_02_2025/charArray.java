import java.util.Scanner;

public class charArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = in.nextInt();
        char array[] = new char[size];

        System.out.print("\nEnter the Char value only\n");
        for (int i = 0; i < size; i++) {
            System.out.println();
            System.out.print((i + 1) + " value : ");
            array[i] = in.next().charAt(0);
        }

        System.out.println("Array Values");
        for (char a : array) {
            System.out.print(a);
        }

        in.close();
    }
}
