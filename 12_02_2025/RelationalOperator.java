
import java.util.Scanner;
public class RelationalOperator
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		System.out.print("Enter First Value : ");
	    int a = in.nextInt();
		System.out.print("Enter Second Value : ");
	    int b = in.nextInt();


		System.out.println("a>b : "+(a>b));
		System.out.println("a>=b : "+(a>=b));
		System.out.println("a<b : "+(a<b));
		System.out.println("a<=b : "+(a<=b));
		System.out.println("a==b : "+(a==b));
	    
	}
}