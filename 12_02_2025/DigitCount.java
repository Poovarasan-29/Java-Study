import java.util.Scanner;
public class DigitCount
{
	
	public static void main(String[] args) {
        
        int n = 1233;
        int digitCount = 0;
        while(n>0){
            n/=10;
            digitCount++;
        }
        System.out.println(digitCount);
	}
}