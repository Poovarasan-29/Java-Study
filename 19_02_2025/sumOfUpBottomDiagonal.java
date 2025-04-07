public class sumOfUpBottomDiagonal {
    public static void main(String[] s) {
        int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int row = array.length;
        int col = array[0].length;
        int top = 0;
        int bottom = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i != j) {
                    if (i < j)
                        top += array[i][j];
                    else
                        bottom += array[i][j];
                }
            }
        }

        array[0][0] = top;
        array[row - 1][col - 1] = bottom;

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
