
import java.util.Scanner;
public class MaxOfTwoV1{
	public static void main(String[]args) {
    Scanner a= new Scanner(System.in);
    System.out.print("Enter 1st Number");
    int x= a.nextInt();
    Scanner b= new Scanner(System.in);
    System.out.print("Enter 2nd Number");
    int y= b.nextInt();
    if(x>=y){
		System.out.println(x+" is greater than or equal to "+y);
	
	}
	else if(y>=x){
		System.out.println(y+" is greater than or equal to "+x);
	}
		
	}
}