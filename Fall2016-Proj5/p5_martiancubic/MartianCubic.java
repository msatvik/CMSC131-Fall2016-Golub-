package p5_martiancubic;

import p5_utility.DoubleWithAppx;

/**
 * A general representation of a Martian Cubic of the form:
 *     (a*x^3 + b*x^2 + c*x + d)
 * 
 * @author Evan Golub
 * @date August-October 2016
 */

public class MartianCubic {
	private final DoubleWithAppx a;
	private final DoubleWithAppx b;
	private final DoubleWithAppx c;
	private final DoubleWithAppx d;
	
	public MartianCubic() {
		a=new DoubleWithAppx(0.0);
		b=new DoubleWithAppx(0.0);
		c=new DoubleWithAppx(0.0);
		d=new DoubleWithAppx(0.0);
	}

	public MartianCubic(DoubleWithAppx dIn) {
		a=new DoubleWithAppx(0.0);
		b=new DoubleWithAppx(0.0);
		c=new DoubleWithAppx(0.0);
		d=dIn;
	}

	public MartianCubic(DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a=new DoubleWithAppx(0.0);
		b=new DoubleWithAppx(0.0);
		c=cIn;
		d=dIn;
	}

	public MartianCubic(DoubleWithAppx bIn, DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a=new DoubleWithAppx(0.0);
		b=bIn;
		c=cIn;
		d=dIn;
	}
	
	public MartianCubic(DoubleWithAppx aIn, DoubleWithAppx bIn, DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a=aIn;
		b=bIn;
		c=cIn;
		d=dIn;
	}
	
	public MartianCubic(MartianCubic other) {
		this(
				other.getA(),
				other.getB(),
				other.getC(),
				other.getD()
			);
		
		
	}
	
	public DoubleWithAppx getA() {
		return a;
	}
	
	public DoubleWithAppx getB() {
		return b;
	}
	
	public DoubleWithAppx getC() {
		return c;
	}
	
	public DoubleWithAppx getD() {
		return d;
	}
	
	
	
	
	
	public DoubleWithAppx eval(DoubleWithAppx x) {
		return new DoubleWithAppx(
				this.getA().multiply(x.power(3))
				.add(this.getB().multiply(x.power(2)))
				.add(this.getC().multiply(x))
				.add(this.getD())
				);
	}
	
	
	public MartianCubic add(MartianCubic martianCubicIn) {
		return new MartianCubic(
				this.getA().add(martianCubicIn.getA()),
				this.getB().add(martianCubicIn.getB()),
				this.getC().add(martianCubicIn.getC()),
				this.getD().add(martianCubicIn.getD())
				);
	}

	public MartianCubic subtract(MartianCubic martianCubicIn) {
		return new MartianCubic(
				this.getA().subtract(martianCubicIn.getA()),
				this.getB().subtract(martianCubicIn.getB()),
				this.getC().subtract(martianCubicIn.getC()),
				this.getD().subtract(martianCubicIn.getD())
				);
	}



	public MartianCubic glorp(MartianCubic martianCubicIn) {
		if((this.getA().multiply(martianCubicIn.getB()).add(this.getB().multiply(martianCubicIn.getA()))).isZero()){
	
			return new MartianCubic(
					this.getA().multiply(martianCubicIn.getA()),
					this.getC().multiply(martianCubicIn.getB()).add(this.getB().multiply(martianCubicIn.getA())).add(this.getA().multiply(this.getD())),
					this.getC().multiply(martianCubicIn.getA()).add(this.getB().multiply(this.getD())),
					this.getC().multiply(this.getD()).multiply(martianCubicIn.getC()).multiply(martianCubicIn.getD())
					);
		}
		else{
			return null;
		}
				
	}

	
	
	
	public MartianCubic splee() {
		return new MartianCubic(
				this.getA().multiply(this.getB()).multiply(this.getC()).multiply(this.getD()).multiply(new DoubleWithAppx(18.0)),
				new DoubleWithAppx(0.0),
				new DoubleWithAppx(-4.0).multiply(this.getB().power(3)).multiply(this.getD()),
				new DoubleWithAppx(0.0)
				);
	}

	
	
	public DoubleWithAppx cliff() {
		DoubleWithAppx x=new DoubleWithAppx(this.getA().power(3).add(this.getB().power(3)).add(this.getC().power(3)).add(this.getD().power(3)));
		if(x.compareTo(new DoubleWithAppx(0.0))==-1){
			return new DoubleWithAppx(42.0);
		}
		else{
			return x.realroot(4);
		}
			
	}


	
	public int compareTo(MartianCubic martianPolyIn) {
		if(this.cliff().compareTo(martianPolyIn.cliff())==0){
			return 0;
		}
		else if(this.cliff().compareTo(martianPolyIn.cliff())==1){
			return 1;
		}
		else {
			return -1;
		}
	}

	
	
	
    public String toString() { 
    	if(this.getB().compareTo(new DoubleWithAppx(0.0))==0&&
    			this.getA().compareTo(new DoubleWithAppx(0.0))==0&&
    			this.getC().compareTo(new DoubleWithAppx(0.0))==0&&
    			this.getD().compareTo(new DoubleWithAppx(0.0))==0){
    		return "0";
    	}
    	else{
    		return this.A()+this.B()+this.C()+this.D();
    	}
    } 
	

	
    
    public String A(){
    	if(this.getA().compareTo(new DoubleWithAppx(0.0))==0){
    		return "";
    	}
    	else{
    		return this.getA().toString()+"x^3";
    	}
    }
    
    
    public String B(){
    	if(this.getA().compareTo(new DoubleWithAppx(0.0))==0){
    		if(this.getB().compareTo(new DoubleWithAppx(0.0))==-1){
        		return "-"+this.getB().abs().toString()+"x^2";
        		}
        		else if(this.getB().compareTo(new DoubleWithAppx(0.0))==0){
        		return ""; 
        	    }
        		else {
        		return this.getB().toString()+"x^2"; 
        	    }
    	}
    	else{
    		if(this.getB().compareTo(new DoubleWithAppx(0.0))==-1){
    		return "-"+this.getB().abs().toString()+"x^2";
    		}
    		else if(this.getB().compareTo(new DoubleWithAppx(0.0))==0){
    		return ""; 
    	    }
    		else {
    		return "+"+this.getB().toString()+"x^2"; 
    	    }
    	}
    }
    
    public String C(){
    	if(this.getB().compareTo(new DoubleWithAppx(0.0))==0&&this.getA().compareTo(new DoubleWithAppx(0.0))==0){
    		if(this.getC().compareTo(new DoubleWithAppx(0.0))==-1){
        		return "-"+this.getC().abs().toString()+"x";
        		}
        		else if(this.getC().compareTo(new DoubleWithAppx(0.0))==0){
        		return ""; 
        	    }
        		else {
        		return this.getC().toString()+"x"; 
        	    }
    	}
    	else{
    		if(this.getC().compareTo(new DoubleWithAppx(0.0))==-1){
    		return "-"+this.getC().abs().toString()+"x";
    		}
    		else if(this.getC().compareTo(new DoubleWithAppx(0.0))==0){
    		return ""; 
    	    }
    		else {
    		return "+"+this.getC().toString()+"x"; 
    	    }
    	}
    }
    
    public String D(){
    	if(this.getB().compareTo(new DoubleWithAppx(0.0))==0&&
    			this.getA().compareTo(new DoubleWithAppx(0.0))==0&&
    			this.getC().compareTo(new DoubleWithAppx(0.0))==0){
    		if(this.getD().compareTo(new DoubleWithAppx(0.0))==-1){
        		return "-"+this.getD().abs().toString();
        		}
        		else if(this.getD().compareTo(new DoubleWithAppx(0.0))==0){
        		return ""; 
        	    }
        		else {
        		return this.getD().toString(); 
        	    }
    	}
    	else{
    		if(this.getD().compareTo(new DoubleWithAppx(0.0))==-1){
    		return "-"+this.getD().abs().toString();
    		}
    		else if(this.getD().compareTo(new DoubleWithAppx(0.0))==0){
    		return ""; 
    	    }
    		else {
    		return "+"+this.getD().toString(); 
    	    }
    	}
    }
	
	
	
	
	//NOTE: THIS IS WRITTEN FOR YOU - DO NOT CHANGE
	@Override
	public boolean equals (Object other) {
		if (other == null) {
			return false;
		}
		else if (this.getClass()!=other.getClass()) {
			return false;
		}
		else {
			MartianCubic casted = (MartianCubic)other;
			return (
					a.equals(casted.a) && 
					b.equals(casted.b) && 
					c.equals(casted.c) && 
					d.equals(casted.d)
			);
		}
	}
	
}
