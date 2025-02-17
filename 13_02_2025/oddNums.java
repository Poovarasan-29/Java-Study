public class oddNums {
    public static void main(String args[]) {
        int num = 123456;
        int oddNum = 0;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            if (rem % 2 != 0) {
                oddNum = oddNum * 10 + rem;
            }
            num /= 10;
        }
        System.out.println("Odd Sum : " + oddNum);
    }
}
