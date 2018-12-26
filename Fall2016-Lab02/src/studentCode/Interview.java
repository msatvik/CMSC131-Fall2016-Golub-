package studentCode;
import java.util.Scanner;


public class Interview {

	public static void main(String[] args) {
		//Create an input scanner
		Scanner s = new Scanner(System.in);

		
		//Prompt the user for their name and read it. Assume the name will be just ONE WORD.
		//The prompt needs to be "What is your name?" and allow the user to enter their answer
		//   on the same line as where the prompt appears.
		System.out.print("What is your name?");
		String name= s.next();
		

		
		
		

		//Prompt the user for their age in whole years and read it.
		//The prompt needs to be "How old are you in full years?" and allow the user to enter 
		//   their answer on the same line as where the prompt appears.
		System.out.print("How old are you in full years?");
		int years= s.nextInt();

		
		
		
		
		//Ask how many full months it has been since their last birthday and read it.
		//The prompt needs to be "How many full months has it been since your last birthday?" 
		//   and allow the user to enter their answer on the same line as where the prompt 
		//   appears.
		System.out.print("How many full months has it been since your last birthday?");
		int months= s.nextInt();

		
		
		
		
		
		//This closes the input scanner since you are done with it by this point.
		s.close();
		
		
		//Calculate their total age in months and store this in a variable. 
        int age_months= (years*12)+(months);
       
		
		/* 
		 * Print the appropriate one of the following lines, depending on their age: 
		 *	age > 900 months, print: Greetings NAME, your age is TOTALMONTHS months. 
		 *  age < 120 months, print: Hello NAME, your age is only TOTALMONTHS months. 
		 *  any other age, print: Howdy NAME, you are TOTALMONTHS months old.
		 */

        
        if(age_months>900){
        	 System.out.print("Greetings"+" "+name+", your age is "+ age_months+" months.");
         }
         else if(age_months<120){
        	 System.out.print("Hello"+" "+name+", your age is only "+ age_months+" months.");
         }
 	     else{
 		
 		    System.out.print("Howdy"+" "+name+", you are "+ age_months+" months old.");
 	     }
 	    	  
 }
 }
		
	    	  
	      
		
		
		
		
		
		
		
		
		
		
	


