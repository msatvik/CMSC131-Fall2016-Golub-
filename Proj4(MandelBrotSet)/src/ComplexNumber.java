
public class ComplexNumber {
	private final double real;
	private final double imag;
	
	public ComplexNumber(double realIn, double imagIn){
		real=realIn;
		imag=imagIn;
	}
	public ComplexNumber(double realIn){
		real=realIn;
		imag=0;
	}
	public ComplexNumber(ComplexNumber a){
		real=a.real;
		imag=a.imag;
	}
	
}

