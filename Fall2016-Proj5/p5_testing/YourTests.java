package p5_testing;
import static org.junit.Assert.*;

import org.junit.Test;

import p5_martiancubic.MartianCubic;
import p5_utility.DoubleWithAppx;


public class YourTests {
	/** SOME EXAMPLE JUNIT TESTS TO GET YOU STARTED THINKING ABOUT 
	  WRITING JUNIT TESTS */
	

	@Test
	public void testDefaultConstructor() {
		MartianCubic testMartianCubic = new MartianCubic();
		assertTrue(testMartianCubic.getA().isZero()
				&& testMartianCubic.getB().isZero()
				&& testMartianCubic.getC().isZero()
				&& testMartianCubic.getD().isZero());
	}
	
	
	
	@Test
	public void testSingleValConstructor() {
		DoubleWithAppx dVal = new DoubleWithAppx(27.8);
				
		MartianCubic testMartianCubic = new MartianCubic(dVal);
		assertTrue(testMartianCubic.getA().isZero()
				&& testMartianCubic.getB().isZero()
				&& testMartianCubic.getC().isZero()
				&& testMartianCubic.getD().equals(dVal));
	}


	
	@Test
	public void testTwoValConstructor() {
		DoubleWithAppx cVal = new DoubleWithAppx(23.2);
		DoubleWithAppx dVal = new DoubleWithAppx(-4.7);
				
		MartianCubic testMartianCubic = new MartianCubic(cVal, dVal);
		assertTrue(testMartianCubic.getA().isZero()
				&& testMartianCubic.getB().isZero()
				&& testMartianCubic.getC().equals(cVal)
				&& testMartianCubic.getD().equals(dVal));
	}


	
	@Test
	public void testThreeValConstructor() {
		DoubleWithAppx bVal = new DoubleWithAppx(15.7);
		DoubleWithAppx cVal = new DoubleWithAppx(-23.7);
		DoubleWithAppx dVal = new DoubleWithAppx(4.3);
				
		MartianCubic testMartianCubic = new MartianCubic(bVal, cVal, dVal);
		assertTrue(testMartianCubic.getA().isZero()
				&& testMartianCubic.getB().equals(bVal)
				&& testMartianCubic.getC().equals(cVal)
				&& testMartianCubic.getD().equals(dVal));
	}


	
	@Test
	public void testFourValConstructor() {
		DoubleWithAppx aVal = new DoubleWithAppx(43.1);
		DoubleWithAppx bVal = new DoubleWithAppx(15.7);
		DoubleWithAppx cVal = new DoubleWithAppx(-23.7);
		DoubleWithAppx dVal = new DoubleWithAppx(4.3);
				
		MartianCubic testMartianCubic = new MartianCubic(aVal, bVal, cVal, dVal);
		assertTrue(testMartianCubic.getA().equals(aVal)
				&& testMartianCubic.getB().equals(bVal)
				&& testMartianCubic.getC().equals(cVal)
				&& testMartianCubic.getD().equals(dVal));
	}


	
	@Test
	public void testCopyConstructor() {
		DoubleWithAppx aVal = new DoubleWithAppx(-19.2);
		DoubleWithAppx bVal = new DoubleWithAppx(24.2);
		DoubleWithAppx cVal = new DoubleWithAppx(-3.2);
		DoubleWithAppx dVal = new DoubleWithAppx(18.7);
		
		MartianCubic testMartianCubic = new MartianCubic(aVal, bVal, cVal, dVal);
		MartianCubic testCopyCubic = new MartianCubic(testMartianCubic);
		
		// Check to be sure they are not aliased!
		assertTrue(testMartianCubic != testCopyCubic);     
		
		assertTrue(testMartianCubic.getA().equals(testCopyCubic.getA())
				&& testMartianCubic.getB().equals(testCopyCubic.getB())
				&& testMartianCubic.getC().equals(testCopyCubic.getC())
				&& testMartianCubic.getD().equals(testCopyCubic.getD()));
		
		assertEquals(testMartianCubic, testCopyCubic);
	}


	
	@Test
	public void testGetters() {
		DoubleWithAppx one = new DoubleWithAppx(1.1);
		DoubleWithAppx two = new DoubleWithAppx(2.2);
		DoubleWithAppx three = new DoubleWithAppx(3.3);
		DoubleWithAppx four = new DoubleWithAppx(4.4);
		
		MartianCubic p = new MartianCubic(one, two, three, four);

		assertTrue(p.getA().equals(one));
		assertTrue(p.getB().equals(two));
		assertTrue(p.getC().equals(three));
		assertTrue(p.getD().equals(four));
	}


	

	//You need to implement at least three of the JUnit tests below.
	//  We encourage you to implement more as part of your regular
	//  testing of your project.
	
	@Test
	public void testAdd() {
		DoubleWithAppx one1 = new DoubleWithAppx(1.1);
		DoubleWithAppx two1 = new DoubleWithAppx(2.2);
		DoubleWithAppx three1 = new DoubleWithAppx(3.3);
		DoubleWithAppx four1 = new DoubleWithAppx(4.4);
		
		MartianCubic p1 = new MartianCubic(one1, two1, three1, four1);
		
		DoubleWithAppx one2 = new DoubleWithAppx(1.1);
		DoubleWithAppx two2 = new DoubleWithAppx(2.2);
		DoubleWithAppx three2 = new DoubleWithAppx(3.3);
		DoubleWithAppx four2 = new DoubleWithAppx(4.4);
		
		MartianCubic p2 = new MartianCubic(one2, two2, three2, four2);
		
		assertTrue(p1.getA().add(p2.getA()).equals(new DoubleWithAppx(2.2)));
		assertTrue(p1.getB().add(p2.getB()).equals(new DoubleWithAppx(4.4)));
		assertTrue(p1.getC().add(p2.getC()).equals(new DoubleWithAppx(6.6)));
		assertTrue(p1.getD().add(p2.getD()).equals(new DoubleWithAppx(8.8)));
		
	}

	@Test
	public void testSubtract() {
		DoubleWithAppx one1 = new DoubleWithAppx(1.1);
		DoubleWithAppx two1 = new DoubleWithAppx(2.2);
		DoubleWithAppx three1 = new DoubleWithAppx(3.3);
		DoubleWithAppx four1 = new DoubleWithAppx(4.4);
		
		MartianCubic p1 = new MartianCubic(one1, two1, three1, four1);
		
		DoubleWithAppx one2 = new DoubleWithAppx(1.0);
		DoubleWithAppx two2 = new DoubleWithAppx(2.0);
		DoubleWithAppx three2 = new DoubleWithAppx(3.0);
		DoubleWithAppx four2 = new DoubleWithAppx(4.0);
		
		MartianCubic p2 = new MartianCubic(one2, two2, three2, four2);
		
		assertTrue(p1.getA().subtract(p2.getA()).equals(new DoubleWithAppx(0.1)));
		assertTrue(p1.getB().subtract(p2.getB()).equals(new DoubleWithAppx(0.2)));
		assertTrue(p1.getC().subtract(p2.getC()).equals(new DoubleWithAppx(0.3)));
		assertTrue(p1.getD().subtract(p2.getD()).equals(new DoubleWithAppx(0.4)));
		
		
	}

	@Test
	public void testGlorp() {
		DoubleWithAppx one1 = new DoubleWithAppx(0.1);
		DoubleWithAppx two1 = new DoubleWithAppx(2.2);
		DoubleWithAppx three1 = new DoubleWithAppx(3.3);
		DoubleWithAppx four1 = new DoubleWithAppx(4.4);
		
		MartianCubic p1 = new MartianCubic(one1, two1, three1, four1);
		
		DoubleWithAppx one2 = new DoubleWithAppx(0.1);
		DoubleWithAppx two2 = new DoubleWithAppx(2.0);
		DoubleWithAppx three2 = new DoubleWithAppx(3.0);
		DoubleWithAppx four2 = new DoubleWithAppx(4.0);
		
		MartianCubic p2 = new MartianCubic(one2, two2, three2, four2);
		
		
		
		assertEquals(p1.glorp(p2), null);
		
	}

	@Test
	public void testSplee() {
		DoubleWithAppx one1 = new DoubleWithAppx(1.0);
		DoubleWithAppx two1 = new DoubleWithAppx(2.0);
		DoubleWithAppx three1 = new DoubleWithAppx(3.0);
		DoubleWithAppx four1 = new DoubleWithAppx(4.0);
		
		MartianCubic p1 = new MartianCubic(one1, two1, three1, four1);
		
		DoubleWithAppx one2 = new DoubleWithAppx(432.0);
		DoubleWithAppx two2 = new DoubleWithAppx(0.0);
		DoubleWithAppx three2 = new DoubleWithAppx(-128.0);
		DoubleWithAppx four2 = new DoubleWithAppx(0.0);
		
		MartianCubic p2 = new MartianCubic(one2, two2, three2, four2);
		
		
		assertEquals(p1.splee(),(p2));
	}

	@Test
	public void testCliff() {
		DoubleWithAppx one1 = new DoubleWithAppx(1.0);
		DoubleWithAppx two1 = new DoubleWithAppx(2.0);
		DoubleWithAppx three1 = new DoubleWithAppx(-3.0);
		DoubleWithAppx four1 = new DoubleWithAppx(-4.0);
		
		MartianCubic p1 = new MartianCubic(one1, two1, three1, four1);
		
		assertEquals(p1.cliff(), new DoubleWithAppx(42));
		
		DoubleWithAppx one2 = new DoubleWithAppx(4.0);
		DoubleWithAppx two2 = new DoubleWithAppx(4.0);
		DoubleWithAppx three2 = new DoubleWithAppx(4.0);
		DoubleWithAppx four2 = new DoubleWithAppx(4.0);
		
		MartianCubic p2 = new MartianCubic(one2, two2, three2, four2);
		assertEquals(p2.cliff(), new DoubleWithAppx(4));
	}

	@Test
	public void testCompareTo() {
		DoubleWithAppx one1 = new DoubleWithAppx(1.1);
		DoubleWithAppx two1 = new DoubleWithAppx(2.2);
		DoubleWithAppx three1 = new DoubleWithAppx(3.3);
		DoubleWithAppx four1 = new DoubleWithAppx(4.4);
		
		MartianCubic p1 = new MartianCubic(one1, two1, three1, four1);
		
		DoubleWithAppx one2 = new DoubleWithAppx(1.0);
		DoubleWithAppx two2 = new DoubleWithAppx(2.0);
		DoubleWithAppx three2 = new DoubleWithAppx(3.0);
		DoubleWithAppx four2 = new DoubleWithAppx(4.0);
		
		MartianCubic p2 = new MartianCubic(one2, two2, three2, four2);
		
		assertEquals(p1.compareTo(p2), 1);
	}

	@Test
	public void testToString(){
		DoubleWithAppx one1 = new DoubleWithAppx(0);
		DoubleWithAppx two1 = new DoubleWithAppx(0);
		DoubleWithAppx three1 = new DoubleWithAppx(37);
		DoubleWithAppx four1 = new DoubleWithAppx(8);
		
		MartianCubic p1 = new MartianCubic(one1, two1, three1, four1);
		
		assertEquals(p1.toString(),"37x+8");
	}
}
