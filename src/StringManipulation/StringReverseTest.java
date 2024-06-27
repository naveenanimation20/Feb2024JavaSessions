package StringManipulation;

public class StringReverseTest {

	public static String reverseString(String s) {

		if (s == null) {
			return null;
		}

		if (s.isBlank() || s.isEmpty()) {
			return s;
		}

		int len = s.length();
		if (len == 1) {
			return s;
		}

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		return rev.trim();
		
		//selenium
		//rev = m
		//rev = rev+u = mu
		//i
		
	}

	public static void main(String[] args) {

		//test cases:
		System.out.println(reverseString("t"));
		System.out.println(reverseString("testing"));
		System.out.println(reverseString("testing automation"));
		System.out.println(reverseString(""));
		System.out.println(reverseString(null));
		System.out.println(reverseString("123"));
		System.out.println(reverseString("t "));
		System.out.println(reverseString("null"));




	}

}
