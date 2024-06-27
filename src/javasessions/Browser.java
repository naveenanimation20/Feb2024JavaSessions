package javasessions;

import java.util.Arrays;

public class Browser {

	public Browser(int a) {
		System.out.println("value = " + a);
	}

	// WAF:
	// launch a browser : browserName(String) -- input param : chrome/ff/safari/edge
	// return : boolean : true/false

	public boolean launchBrowser(String browserName) {
		System.out.println("launching browser ----" + browserName);

		if (browserName.equals("chrome")) {
			System.out.println("chrome is launched");
			return true;
		} else if (browserName.equals("firefox")) {
			System.out.println("ff is launched");
			return true;
		} else if (browserName.equals("edge")) {
			System.out.println("edge is launched");
			return true;
		} else if (browserName.equals("safari")) {
			System.out.println("safari is launched");
			return true;
		} else {
			System.out.println("plz pass the right browser....");
			return false;
		}

	}

	public boolean launchAppBrowser(String browserName) {
		System.out.println("launching browser ----" + browserName);

		boolean flag = true;

		switch (browserName) {
		case "chrome":
			System.out.println("chrome is launched");
			// break;
		case "firefox":
			System.out.println("ff is launched");
			break;

		case "edge":
			System.out.println("edge is launched");
			break;

		case "safari":
			System.out.println("safari is launched");
			break;

		default:
			System.out.println("plz pass the right browser....");
			flag = false;
			break;

		}

		return flag;

	}

	// WAF:
	// function name: getStudentMarks
	// input param: studentName(String)
	// return: marks(int)

	public int getStudentMarks(String studentName) {// arti Arti ARTI aRTI
		System.out.println("getting student marks :" + studentName);

		int marks = -1;

		switch (studentName.trim().toLowerCase()) {
		case "arti":
			marks = 90;
			break;
		case "ravi":
			marks = 95;
			break;
		case "krishan":
			marks = 100;
			break;
		case "naveen":
			marks = 10;
			break;

		default:
			System.out.println("plz pass the right student name...." + studentName);
			break;
		}

		return marks;

	}

	public int[] getData() {
		int num[] = { 10, 20, 30 };
		return num;
	}

	// caller method
//	public static void main(String[] args) {
//		Browser br = new Browser();
//
//		int n[] = br.getData();
//		System.out.println(Arrays.toString(n));
//		System.out.println(n.length);
//
//		int m1 = br.getStudentMarks("Arti ");
//		System.out.println(m1);
//
//		if (m1 >= 0 && m1 <= 100) {
//			System.out.println("print the marksheet");
//		}
//
//		int m2 = br.getStudentMarks("naveen");
//		System.out.println(m2);
//
//		int m3 = br.getStudentMarks("tom");
//		System.out.println(m3);// -1
//
//		if (m3 >= 0 && m3 <= 100) {
//			System.out.println("print the marksheet");
//		}
//
//		if (br.launchAppBrowser("chrome")) {
//			System.out.println("enter url: https://google.com");
//		} else {
//			System.out.println("no need to enter the url");
//		}
//
////		boolean flag = br.launchBrowser("ie");
////		System.out.println(flag);
////		if (flag) {
////			System.out.println("enter url: https://google.com");
////		} else {
////			System.out.println("no need to enter the url");
////		}
//	}

}
