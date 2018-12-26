package studentCode;

public class CryptoCode {
	//Handles ASCII 32 through ASCII 93
	static final char FIRST = ' ';
	static final char LAST = ']';
	static final int RANGE = LAST-FIRST+1;
	
	//YOUR CODE WILL BE DOWN HERE
	//AS YOU WORK ON EACH METHOD, DELETE THE "throw" LINE AND
	//   ADD YOUR CODE TO IMPLEMENT THE METHOD
	//TEST AS YOU GO TASK BY TASK
	
	public static boolean safeToUse(String plaintext) 
	{
		String plaintextUpperCase = plaintext.toUpperCase();
		for(int i=0; i < plaintextUpperCase.length(); i++)
		{
			char c = plaintextUpperCase.charAt(i);
			int ascii = (int) c;			
			if(ascii > 93 || ascii < 32) 
			{
		      return false;
		     
			}			
		}
		return true;	
	}
	public static String rot31(String message)
	{
		
		message=message.toUpperCase();
		for(int i=0;i<message.length();i++){
			char c= message.charAt(i);
			int ascii = (int) c;
			ascii= ascii+31;
			if(ascii>93){
				ascii=ascii-62;	
			}			
			message=message+(char) ascii; //(result+=(char) ascii)
			
		}
		return message;
	}
	public static String toCaesar(String plaintext, int shift)
	{
		
		String result = "";
		plaintext=plaintext.toUpperCase();
		for(int i=0;i<plaintext.length();i++){
			char c= plaintext.charAt(i);
			int ascii = (int) c;
			if(shift>62){
				shift=shift%RANGE;
				}
			ascii= ascii + shift;
			result= result+ (char)ascii;
	}
		return result;
	}
	
	public static String fromCaesar(String ciphertext, int shift)
	{
		return toCaesar(ciphertext, (-shift));
	}
		
	    
	public static String toBellaso(String plaintext, String keyword)
	{
		String encryptedString ="";
		String plaintextUpperCase = plaintext.toUpperCase();
		String equalLengthKeyword = "";
		if(keyword.length() < plaintextUpperCase.length())
		{
			for(int i = 0, j=0; j < plaintextUpperCase.length(); i++, j++)
			{
				equalLengthKeyword += keyword.toUpperCase().charAt(i);

				if(i == keyword.length() -1)
				{
					i = -1;
				}
				
			}
		}
		else
		{
			equalLengthKeyword = keyword;
		}
		for(int i = 0; i< plaintextUpperCase.length(); i++)
		{
			int acsiiValueOfPlainTextChar = (int) plaintextUpperCase.charAt(i);
			int asciiValueOfEqualKeyWordChar = (int) equalLengthKeyword.charAt(i);
			int difference = asciiValueOfEqualKeyWordChar - 32;
			int addition = acsiiValueOfPlainTextChar+difference;
			
			if(addition > 93)
			{
				addition = addition- RANGE;
			}
			
			encryptedString += (char) addition;
		}
		
		//Solve for C and I in plaintext="Computer Science" and write the calculation below
		/*
		 * For C:
		 * acsiiValueOfPlainTextChar = ??
		 * asciiValueOfEqualKeyWordChar = ??
		 * difference = ??
		 * addition
		 * if condition: true/false then addition value is: 
		 * encryptedString:
		 *  
		 * For I:
		 * acsiiValueOfPlainTextChar = ??
		 * asciiValueOfEqualKeyWordChar = ??
		 * difference = ??
		 * addition
		 * if condition: true/false then addition value is: 
		 * encryptedString:
		 */
		return encryptedString;
	}

	public static String fromBellaso(String ciphertext, String keyword){
		String Upperct=ciphertext.toUpperCase();
		String Upperkw=keyword.toUpperCase();
		char[] decodedMes=new char[Upperct.length()];
		char[] changedky=new char[Upperct.length()];
		for(int i=0;i<Upperct.length();i++){
			changedky[i]=Upperkw.charAt(i%Upperkw.length());
			
		}
		for(int j=0;j<Upperct.length();j++){
			decodedMes[j]=Upperct.charAt(j);
			if(decodedMes[j]-changedky[j]+32<32){
				decodedMes[j]-=changedky[j]-94;
			}
			else{
				decodedMes[j]-=changedky[j]-32;
			}
		}
		String decodedpt=new String(decodedMes);
		return decodedpt;
		}	
}


