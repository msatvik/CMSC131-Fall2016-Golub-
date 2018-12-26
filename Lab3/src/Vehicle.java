
public class Vehicle {
	public static final int MAX_WHEELS=18;
	public int numWheels;
	public int length;

	public Vehicle(int numWheelsIn, int lengthIn){
		numWheels=numWheelsIn;
		length=lengthIn;
		if(numWheels>MAX_WHEELS){
			numWheels=MAX_WHEELS;
		}
	}
	public int getWeight(){
		return 250*length;
	}
	public int getPower(){
		return getWeight()*numWheels;
	}
	public static void crash(Vehicle a, Vehicle b){
		if(a.getPower()>b.getPower()){
			b.numWheels=0;
		}
		else{
			a.numWheels=0;
		}
	}

}
