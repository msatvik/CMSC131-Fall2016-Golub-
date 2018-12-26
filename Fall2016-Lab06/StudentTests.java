import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTests {
	
	//This is a place for you to practice writing some JUnit tests and
	//   get help from us or your peers if needed.
	
	
	@Test
	public void testConstructorOnDivideByZero() {
		

	}
	
	
	@Test
	public void testAllOpsWithDenomOfOne() {

	}
	

	@Test
	public void testReciprocal() {
		int numer=2;
		int denom=3;
		Rational r1=new Rational(2,3);
		Rational recip=r1.reciprocal();
		assertEquals(recip.getNumer(),denom);
		assertEquals(recip.getDenom(),numer);

	}
	
	
	@Test
	public void testMultiply() {
		
		

	}
	
	
	@Test
	public void testDivide() {
		int numer=10;
		int denom=12;
		Rational r1=new Rational(2,3);
		Rational r2=new Rational(4,5);
		Rational div=r1.divide(r2);
		System.out.print(div.getNumer());
		assertEquals(div.getNumer(),denom);
		assertEquals(div.getDenom(),numer);

	}
	
	
	@Test
	public void testAdd() {
		
		

	}
	
	
	@Test
	public void testSubtract() {

	}

	
}

