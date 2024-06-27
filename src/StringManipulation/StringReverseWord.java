package StringManipulation;

public class StringReverseWord {

	public static void main(String[] args) {

		
		String s = "this is my java code";//siht si ym avaj edoc
		
		String ss[] = s.split(" ");
		String rev = "";
		for(String e : ss) {
			rev = rev + StringReverseTest.reverseString(e)+" ";
		}
		
		System.out.println(rev.trim());
		
		
		
	}

}
