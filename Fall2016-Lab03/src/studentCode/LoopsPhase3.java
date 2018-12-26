package studentCode;
import java.util.Scanner;

public class LoopsPhase3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Triangle Size? ");
		int size = sc.nextInt();


		//YOUR CODE HERE
		for(int i=1; i<=size;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		//YOUR CODE HERE
		

		sc.close();
	}

}
