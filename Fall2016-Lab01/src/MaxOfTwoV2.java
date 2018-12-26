
import java.util.Scanner;
public class MaxOfTwoV2{
	public static void main(String[]args) {
    Scanner a= new Scanner(System.in);
    System.out.print("Enter 1st Number");
    int x= a.nextInt();
    Scanner b= new Scanner(System.in);
    System.out.print("Enter 2nd Number");
    int y= b.nextInt();
		if(x>y){
			System.out.println(x+" is greater than "+y);
		
		}
		else if(y>x){
			System.out.println(y+" is greater than "+x);
		}
		else{
				System.out.println(x+" is equal to "+y);
			
		}
		
	}

}