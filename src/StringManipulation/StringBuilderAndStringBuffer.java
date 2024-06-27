package StringManipulation;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {

		//mutable
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Selenium");
		System.out.println(sb);
		
		
		//slow: 1.1 : legacy classes
		StringBuffer sf = new StringBuffer("Testing");
		sf.append("Cypress");
		System.out.println(sf);
		
		
	}

}
