package studentCode;

import java.util.Scanner;

public class MultilingualGreetings {
	private static String greetingString;
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		 System.out.print("1) English   2) Espanol   3) Francais:");
		    int choice= myScanner.nextInt();
		    if(choice==1){
		    	greetingString="Hello World!";
		    	System.out.println(greetingString);
		    }
		    else if(choice==2){
		    	greetingString="Hola Mundo!";
		    	System.out.println(greetingString);
		    }
		    else if(choice==3){
		    	greetingString="Bonjour le Monde!";
		    	System.out.println(greetingString);
		    }
		    else{
		        greetingString="###########";    
		        System.out.println(greetingString);
		    }
		myScanner.close();
	}
}
