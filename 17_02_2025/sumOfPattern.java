public class sumOfPattern {
    public static void main(String[] args) {
        int x = 3, n = 4;
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sum = sum * 10 + x;
            ans += sum;
        }
        System.out.println(ans);
    }
}
