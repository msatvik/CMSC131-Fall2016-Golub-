package testingCode;
import org.junit.Test;
import junit.framework.TestCase;


public class SampleTests extends TestCase {
	
	@Test
	public void isItSafe() {
		assertTrue(studentCode.CryptoCode.safeToUse("ABCDE"));
	}
	
	@Test
	public void testRotate31() {
		String plaintext = "Hello Class";
		String ciphertext = ")&--0?$-\"44";
		assertEquals(
			ciphertext,
			studentCode.CryptoCode.rot31(plaintext)
		);
	}
		
	@Test
	public void testCaesar() {
		String plaintext = "ABCDE";
		int shift = 5;
		String ciphertext = "FGHIJ";

		assertEquals(
			ciphertext,
			studentCode.CryptoCode.toCaesar(plaintext, shift)
		);
	}

	@Test
	public void testBellaso() {
		//String plaintext = "Computer Science";
		//String keyword = "CMSC131";
		//String ciphertext = "(>B5()V7MH(ZX!(4";
		
		String plaintext = "Greeting Humans.";
		String keyword = "MarsRulez!";
		String ciphertext = "659:H@<.ZID05CG%";

		assertEquals(
			ciphertext,
			studentCode.CryptoCode.toBellaso(plaintext, keyword)
		);
	}

}
