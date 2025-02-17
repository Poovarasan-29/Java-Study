public class evenNums {
    public static void main(String args[]) {
        int num = 123456;
        int evenNum = 0;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            if (rem % 2 == 0) {
                evenNum = evenNum * 10 + rem;
            }
            num /= 10;
        }
        System.out.println("Odd Sum : " + evenNum);
    }
}
