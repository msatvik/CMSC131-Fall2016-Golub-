import java.util.Scanner;
	public class CryptoQuiz {
		public static void main(String[]args){
			Scanner a= new Scanner(System.in);	
			System.out.println("Enter 1 to guess a cryptographic system, 2 to guess how many BITs: ");
			int n= a.nextInt();
			Scanner b= new Scanner(System.in);
			
			Scanner c= new Scanner(System.in);
			
			if(n==1){
				System.out.println("Choose number of BITs");
				int bit= b.nextInt();
			   if(bit==80){
				   System.out.println("Which cryptographic system uses 80 BITs? ");
				   String str= c.next();
			       if(str.equalsIgnoreCase("Skipjack"))			    	   
			    	   System.out.println("Correct");
			       else
			    	   System.out.println("Incorrect");
			   
			   }
			   else if(bit==128){
				   System.out.println("Which cryptographic system uses 128 BITs? ");
				   String str=c.next();
			       if(str.equalsIgnoreCase("Rijndael"))
		    	       System.out.println("Correct");
		           else
		    	       System.out.println("Incorrect");
		   }
			
			   else if(bit==168){
				   System.out.println("Which cryptographic system uses 168 BITs? ");
				   String str=c.next();
			       if(str.equalsIgnoreCase("Rijndael"))
		    	       System.out.println("Correct");
		           else
		    	       System.out.println("Incorrect");
		   }
			   else{
				  System.out.println("Invalid Choice"); 
			   }
			
			}
			else if(n==2){
				System.out.println("Choose a cryptographic system:");
				String str=c.next();
				if(str.equalsIgnoreCase("Skipjack")){
					System.out.println("How many BITs used in a Skipjack system?");
					int bit= b.nextInt();
				       if(bit==80)
				    	   System.out.println("Correct");
				       else
				    	   System.out.println("Incorrect");
				   }
				else if(str.equalsIgnoreCase("Rijndael")){
					System.out.println("How many BITs used in a Rijndael system?");
					int bit=b.nextInt();
				       if(bit==128)
				    	   System.out.println("Correct");
				       else
				    	   System.out.println("Incorrect");
				}
				
				else if(str.equalsIgnoreCase("TripleDES")){
					System.out.println("How many BITs used in a TripleDES system?");
					int bit=b.nextInt();
				       if(bit==168)
				    	   System.out.println("Correct");
				       else
				    	   System.out.println("Incorrect");
				}
				
			}
			else{
				System.out.println("Invalid Choice");
				
			}	
		}	
	}





