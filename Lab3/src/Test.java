import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Vehicle x=new Vehicle(4,15);
		assertTrue(x.numWheels==4);
		assertTrue(x.length==15);
	}
	@org.junit.Test
	public void testWeight(){
		Vehicle x=new Vehicle(4,15);
		assertTrue(x.getWeight()==3750);
	}
	@org.junit.Test
	public void testPower(){
		Vehicle x=new Vehicle(4,15);
		assertTrue(x.getPower()==15000);
	}
	@org.junit.Test
	public void testCrash(){
		Vehicle a=new Vehicle(4,15);
		Vehicle b=new Vehicle(3,15);
		Vehicle.crash(a, b);
		assertTrue(b.numWheels==0);
		assertTrue(a.numWheels==4);
	}
	
}
