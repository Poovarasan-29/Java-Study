public class pattern_8 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (i * 2) / 2; j++) {
                System.err.print(j + " ");
            }
            for (int j = (i * 2 - 1) / 2; j > 0; j--) {
                System.err.print(j + " ");
            }
            System.out.println();
        }
    }
}
