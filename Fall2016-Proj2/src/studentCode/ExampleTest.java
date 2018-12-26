package studentCode;

public class ExampleTest {

	public static void main(String[] args) {
		//An example of how you might test out your code on more complex
		//  things without having to type things in over and over.
		//String plaintext="Computer Science";
		//String ciphertext="FGHIJ";
		//int shift=131;
		String myAnswer;
		//
				
		String plaintext = "computer science";
		String ciphertext = "FGHIJ";
		
		if (CryptoCode.safeToUse(plaintext)) {
			System.out.println("Yay, it's a valid message to crypt!");
		}
		else {
			System.out.println("Ooops.");
		}
		
		/*shift = 5;
		ciphertext = "FGHIJ";
		myAnswer = CryptoCode.toCaesar(plaintext, shift);
		
		if (myAnswer.equals(ciphertext)) {
			System.out.println("Yay, it worked!");
		}
		else {
			System.out.println(
				"Should have been " + ciphertext +
				" but ended up being " + myAnswer
			); 
		}*/
		
		plaintext = "Computer Science";
		String keyword = "CMSC131";
		ciphertext = "(>B5()V7MH(ZX!(4";
		myAnswer = CryptoCode.toBellaso(plaintext, keyword);
		
		/*if(myAnswer.equals(ciphertext))
		{
			System.out.println("Good one");
		}
		else {
			System.out.println(
				"Should have been " + ciphertext +
				" but ended up being " + myAnswer
			); 
		}*/
		
		myAnswer = CryptoCode.fromBellaso(ciphertext, keyword);
		if(myAnswer.equals(plaintext))
		{
			System.out.println("Good one");
		}
		else {
			System.out.println(
				"Should have been " + plaintext +
				" but ended up being " + myAnswer
			); 
		}	
	}
}
