public class primeSum {
    public static void main(String args[]) {
        int num = 123456;
        int oddNum = 0;
        int evenNum = 0;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            boolean check = false;
            for (int i = 2; i <= Math.floor(Math.sqrt(rem)); i++) {
                if (rem % i == 0) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                if (rem % 2 == 0)
                    evenNum = evenNum * 10 + rem;
                else
                    oddNum = oddNum * 10 + rem;
            }
            num /= 10;
        }
        System.out.println("Odd : " + oddNum + " Even : " + evenNum);
    }
}
