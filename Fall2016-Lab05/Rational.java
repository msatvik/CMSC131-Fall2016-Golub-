
public class Rational {

	//DATA FIELDS SHOULD GO UP HERE
	
	private final int numer,denom;
	//Constructor
	public Rational(int numerIn, int denomIn) {
		//Remove the below line when you are ready to implement this method.
	    numer=numerIn;
		denom=denomIn;
	}
	
	
	
	
	//Getters
	public int getNumer() {
		//Remove the below line when you are ready to implement this method.
		
		return numer;
		
	}
	
	public int getDenom() {
		//Remove the below line when you are ready to implement this method.
		return denom;
		
	}
	
	
	
	
	
	
	public String toString() {
		//Remove the below line when you are ready to implement this method.
		
		
		String ans1= numer+"/"+denom;
		return ans1;
	}
	
	
	
	

	public static Rational multiply(Rational a, Rational b) {
		//Remove the below line when you are ready to implement this method.
		int num1= a.getNumer();
		int den1=a.getDenom();
		int num2=b.getNumer();
		int	den2=b.getDenom();
		int resDenom= den1*den2;
		int resNum= num1*num2;
		Rational res=new Rational(resNum,resDenom);
		return res;	
	}
	
	
	
	
	
	public Rational reciprocal() {
		//Remove the below line when you are ready to implement this method.
		Rational result=new Rational(denom,numer);
		return result;
	}
	
	public Rational divide(Rational a) {
		//Remove the below line when you are ready to implement this method.
		int num1=a.getNumer();
		int den1=a.getDenom();
		int num2=this.getNumer();
		int	den2=this.getDenom();
		int resNum=num1*den2;
		int resDenom= num2*den1;
		System.out.print(resNum);
		Rational res=new Rational(resNum,resDenom);
		return res;	
		
	}
	
	public Rational add(Rational a) {
		//Remove the below line when you are ready to implement this method.
		int num1=a.getNumer();
		int den1=a.getDenom();
		int num2=this.getNumer();
		int	den2=this.getDenom();
		int resDenom= den1*den2;
		int resNum= (num1*den2)+(num2*den1);;
		Rational res=new Rational(resNum,resDenom);
		return res;	
	}
	
	
	//NOTE: We are not writing an equals method for this class at this time.
	//      For this reason, do not use assertEquals to try to test whether
	//      two Rational objects are equal in value.
	
}
