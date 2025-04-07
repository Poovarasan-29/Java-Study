import java.util.Scanner;

public class array2D {

    static Scanner in = new Scanner(System.in);

    public static void sort(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int x = i; x < array.length; x++) {
                    for (int y = x == i ? j + 1 : 0; y < array[x].length; y++) {
                        if (array[i][j] > array[x][y]) {
                            array[x][y] = array[x][y] ^ array[i][j];
                            array[i][j] = array[x][y] ^ array[i][j];
                            array[x][y] = array[x][y] ^ array[i][j];
                        }
                    }
                }

            }
        }
        // return array;
    }

    public static void rotate(int array[][]) {

            
    }

    public static void main(String[] args) {
        System.out.print("Enter matrix row size : ");
        int row = in.nextInt();
        System.out.print("\nEnter matrix column size : ");
        int col = in.nextInt();

        int array[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter " + (i + 1) + " row values : ");
            for (int j = 0; j < col; j++) {
                array[i][j] = in.nextInt();
            }
        }

        sort(array);
        System.out.println("Your matrix is Ready for Print ::)");
        for (int rowVal[] : array) {
            for (int val : rowVal) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
