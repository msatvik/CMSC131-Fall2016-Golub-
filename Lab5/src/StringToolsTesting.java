import static org.junit.Assert.*;

import org.junit.Test;

public class StringToolsTesting {

	@Test
	public void count() {
		String a = "abcaas";
		char c = 'a';
		assertTrue(StringTools.count(a, c) == 3);

	}

		@Test
	public void countSubstring(){
		String a="SatvikSat";
		String b="Sat";
		assertTrue(StringTools.countSubstring(a, b)==2);
	}
	
	@Test
	public void reverse(){
		String a="satvik";
		String b="kivtas";
		assertTrue(StringTools.reverse(a).equals(b));
	}
	
	

}
