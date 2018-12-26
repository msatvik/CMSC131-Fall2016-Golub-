

//Don't forget to start off by copying the contents of any methods that
//   do not need to change from your Lab05 to this Lab06.


public class Rational {
	
	private final int numer,denom;
	
    	
	public Rational(int numerIn, int denomIn) throws ArithmeticException {
		//Remove the below line when you are ready to implement this method.
		if(denomIn==0)
			throw new ArithmeticException();
		 numer=numerIn;
		 denom=denomIn;
	}
	
	//The new copy constructor!!!
	public Rational(Rational other) {
		//Remove the below line when you are ready to implement this method.
		numer=other.getNumer();
		denom=other.getDenom();
		
	}
	
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
	
	public Rational reciprocal() {
		//Remove the below line when you are ready to implement this method.

		Rational result=new Rational(denom,numer);
		return result;
	}
	

	public static Rational multiply(Rational first, Rational second) {
		//Remove the below line when you are ready to implement this method.
		
		int num1= first.getNumer();
		int den1=first.getDenom();
		int num2=second.getNumer();
		int	den2=second.getDenom();
		int resDenom= den1*den2;
		int resNum= num1*num2;
		Rational res=new Rational(resNum,resDenom);
		return res;	
	}
	
	public Rational divide(Rational otherRational) {
		//Remove the below line when you are ready to implement this method.
		
		int num1=this.getNumer();
		int den1=this.getDenom();
		int num2=otherRational.getNumer();
		int	den2=otherRational.getDenom();
		int resNum=num1*den2;
		int resDenom= num2*den1;
		Rational res=new Rational(resNum,resDenom);
		return res;	
	}
	
	public Rational add(Rational otherRational) {
		//Remove the below line when you are ready to implement this method.
		
		int num1=otherRational.getNumer();
		int den1=otherRational.getDenom();
		int num2=this.getNumer();
		int	den2=this.getDenom();
		int resDenom= den1*den2;
		int resNum= (num1*den2)+(num2*den1);;
		Rational res=new Rational(resNum,resDenom);
		return res;	
	}
	
	//The new subtract!!!
	public Rational subtract(Rational otherRational) {
		//Remove the below line when you are ready to implement this method.
		
		int num1=otherRational.getNumer();
		int den1=otherRational.getDenom();
		int num2=this.getNumer();
		int	den2=this.getDenom();
		int resDenom= den1*den2;
		int resNum= (num1*den2)-(num2*den1);;
		Rational res=new Rational(resNum,resDenom);
		return res;	
	}
}
