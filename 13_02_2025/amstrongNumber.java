 
public class amstrongNumber{
    public static void main(String args[]) {
        int num = 123456;
        int oddNum = 0;
        int rem = 0;
		int digit = 0;
		int multiplication = 1;
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
                if (rem % 2 != 0){
                    oddNum = oddNum + rem*multiplication;
					multiplication*=10;
					digit++;
				}
			}
            num /= 10;
        }
        int amstrongSum = 0;
		int amsRem =10;
		int copyOddNum = oddNum;
		while(copyOddNum>0){
			amsRem = copyOddNum% 10;
			amstrongSum += (int)Math.pow(amsRem,digit);
			copyOddNum/=10;
		}
		if(oddNum == amstrongSum){
			System.out.println("Amstrong Number");
		}else{
			System.out.println("Not a Amstrong Number");
		}
    }
}