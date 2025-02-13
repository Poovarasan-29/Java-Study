
import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int values[] = new int[100];
		System.out.print("Enter limit to find Prime Number : ");
		int input = in.nextInt();
		int len = 0;
		if(input >0) {
			values[len] = 1;
			len++;
		}
		if(input >1) {
			values[len] = 2;
			len++;
		}
		for(int i=3; i<=input; i=i+2) {

			boolean check  = true;
			for(int j=3; j<=Math.floor(Math.sqrt(i)); j++) {
				if(i%j==0) {
					check = false;
					break;
				}
			}
			if(check) {
				values[len] = i;
				len++;

			}
		}
        
        for(int i=0;i<len;i++){
            System.out.print(values[i]+" ");
        }

	}

}