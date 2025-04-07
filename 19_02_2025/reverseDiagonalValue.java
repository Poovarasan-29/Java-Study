public class reverseDiagonalValue {
    public static void main(String[] s) {
        int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int row = array.length;
        // int col = array[0].length;

        for (int i = 0; i < Math.floor(row / 2); i++) {
            array[i][i] = array[i][i] ^ array[row - i - 1][row - i - 1];
            array[row - i - 1][row - i - 1] = array[i][i] ^ array[row - i - 1][row - i - 1];
            array[i][i] = array[i][i] ^ array[row - i - 1][row - i - 1];

        }

        for (int arow[] : array) {
            for (int val : arow) {
                System.out.print(val + " ");
                if (val < 10)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
