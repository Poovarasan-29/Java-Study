public class patter_13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= (n / 2); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i * 2; j++) {
                if (j == 0 || j == n - i * 2 - 1)
                    System.out.print(" x");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = (n / 2)-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i * 2; j++) {
                if (j == 0 || j == n - i * 2 - 1)
                    System.out.print(" x");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
