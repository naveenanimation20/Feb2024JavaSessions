package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		String browser = "ie";
		int version = 121;

		switch (browser.trim().toLowerCase()) {//Chrome --> Chrome->chrome
		case "chrome":
				if(version==120) {
					System.out.println("launch chrome with version" + version);
				}
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("plz pass the right browser..." + browser);
			break;
		}

		//
		int marks = 40;
		// 0-100
		switch (marks) {
		case 0:
			System.out.println("0 marks");
			break;
		case 1:
			System.out.println("1 mark");
			break;

		default:
			break;
		}

		// use cases:
		// multiple env: dev, qa, stage, uat, prod
		// cross browser
		// RBAC: admin, seller, vendor, partner, customer, catmanager
		// payment methods: cards, paypal, upi, bank

//		double salary = 12.33;
//		
//		switch (salary) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}

//		byte test = 10;
//		switch (test) {
//		case 10:
//			
//			break;
//
//		default:
//			break;
//		}

//		long dist = 1000;
//		switch (dist) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}

		// char, byte, short, int, String -- allowed

		char gender = 'm';
		switch (gender) {
		case 'm':

			break;
		case 'f':

			break;

		default:

			break;
		}

		// vowels: a e i o u
		char ch = 'A';
		switch (ch) {
		case 'a':
			System.out.println(ch + " is a vowel");
			break;
		case 'e':
			System.out.println(ch + " is a vowel");
			break;
		case 'i':
			System.out.println(ch + " is a vowel");
			break;
		case 'o':
			System.out.println(ch + " is a vowel");
			break;
		case 'u':
			System.out.println(ch + " is a vowel");
			break;

		default:
			System.out.println(ch + " is a consonent");
			break;
		}

	}

}
