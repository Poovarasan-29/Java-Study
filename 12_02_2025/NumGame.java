
import java.util.Scanner;
public class NumGame
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hint : Stop the Program by entering -1");
		System.out.println("---------------------------------------");
        int totalQuestions = 0;
        int rightAnswers = 0;
		while(true) {
			int a = (int)(Math.random() * 11);
			int b = (int)(Math.random() * 11);
			System.out.print(a+" + "+b+" = ");
			int ans = in.nextInt();
			if(ans == -1) {
			System.out.println("Total Questoins : "+(totalQuestions));
			System.out.println("Mark Scored : "+rightAnswers);
			System.out.println("Loss Marks : "+(totalQuestions-rightAnswers));
				break;
			}
			totalQuestions = totalQuestions+1;
			if(ans == (a+b)) {
			    rightAnswers = rightAnswers+1;
				// System.out.println("Ahh! Right");
			}else{
				System.out.println("Oops! wrong X");
			}
		}
	}
}