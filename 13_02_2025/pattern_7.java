public class pattern_7 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || i == n)
                    System.out.print("x ");
                else
                    System.out.print("o ");
            }
            System.out.println();
        }
    }
}
