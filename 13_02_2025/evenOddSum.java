class Main {
    public static void main(String args[]) {
        int num = 123456;
        int evenSum = 0;
        int oddSum = 0;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            if (rem % 2 == 0)
                evenSum += rem;
            else
                oddSum += rem;

            num /= 10;
        }
        System.out.println("Even Sum : " + evenSum + " || Odd Sum : " + oddSum);
    }
}