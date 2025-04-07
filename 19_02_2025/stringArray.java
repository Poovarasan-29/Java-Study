import java.util.Scanner;

public class stringArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = in.nextInt();
        in.nextLine();
        String array[] = new String[size];

        System.out.print("\nEnter the String values only\n");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " value : ");
            array[i] = in.nextLine();
        }

        System.out.println("\nArray Values");
        for (String a : array) {
            System.out.print(a + " | ");
        }

        in.close();
    }
}
