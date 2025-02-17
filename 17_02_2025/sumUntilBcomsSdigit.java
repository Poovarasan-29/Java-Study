public class sumUntilBcomsSdigit {
    public static void main(String[] args) {
        int array[] = { 3, 4, 5, 6 };
        int sum = 0;
        for (int a : array) {
            sum += a;
        }

        while (sum >= 10) {
            int tSum = sum;
            int currentSum = 0;
            while (tSum > 0) {
                currentSum += tSum % 10;
                tSum /= 10;
            }
            sum = currentSum;
        }
        System.out.println(sum);

    }
}
