public class pattern_4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = n-i; j < n; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
