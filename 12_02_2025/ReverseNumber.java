import java.util.Scanner;
public class ReverseNumber
{
	
	public static void main(String[] args) {
        
        int n = 123,rem=0,reverse=0;
        
        while(n>0){
            rem = n%10;
            reverse = reverse*10 + rem;
            n/=10;
        }
        System.out.println(reverse);
	}
}