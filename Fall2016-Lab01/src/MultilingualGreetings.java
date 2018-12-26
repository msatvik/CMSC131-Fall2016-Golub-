
import java.util.Scanner;
public class MultilingualGreetings {
	public static void main(String[]args) {
	    Scanner a= new Scanner(System.in);
	    System.out.print("1) English   2) Espanol   3) Francais:");
	    int n= a.nextInt();
	    if(n==1){
	    	System.out.println("Hello World!");
	    }
	    else if(n==2){
	    	System.out.println("Hola Mundo!");
	    }
	    else if(n==3){
	    	System.out.println("Bonjour le Monde!");
	    }
	    else{
	    	System.out.println("###########");
	    }
   }
}
