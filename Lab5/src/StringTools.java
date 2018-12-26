import javax.print.DocFlavor.STRING;

import org.hamcrest.core.StringContains;

public class StringTools {

	public static int count(String a, char c) {
		int counter = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == c) {
				counter++;
			}
		}
		return counter;
	}

	public static int countSubstring(String a, String b) {
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {

			lastIndex = a.indexOf(b, lastIndex);

			if (lastIndex != -1) {
				count++;
				lastIndex += b.length();
			}
		}
		return count;

	}

	public static String reverse(String a) {
		String result = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			result = result + a.charAt(i);
		}

		return result;
	}

	public static String expand(String a) {
		String result = "";
		for (int i = 1; i < a.length(); i++) {
			for (int j = 2; j < a.length(); j++)
				result = "" + a.charAt(0) + j * a.charAt(i);
			result = result.toString();
		}
		return result;
	}
}
