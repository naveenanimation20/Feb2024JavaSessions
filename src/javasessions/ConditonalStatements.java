package javasessions;

public class ConditonalStatements {

	public static void main(String[] args) {

		int a = 400;
		int b = 200;
		
		if(a>b) {
			System.out.println("a is gr than b");
		}
		else {
			System.out.println("b is gr than a");
		}
		
		
		if(true) {
			System.out.println("PASS");
		}
		else {//dead code/unreachable code
			System.out.println("FAIL");
		}
		
		//
		boolean flag = false;
		if(flag) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		
		//nested if
		int marks = 150;
		if(marks<=100) {
			System.out.println("calculating grade");
				if(marks>=90) {
					System.out.println("GRADE A");
						if(marks >=95) {
							System.out.println("GRADE A++");
								if(marks==100) {
									System.out.println("eligible for scholarship");
								}
						}
				}
				else {
					System.out.println("GRADE B");

					if(marks<=50) {
						System.out.println("GRADE C");
					}
				}
		}
		else {
			System.out.println("marks not valid");
		}
		
		
		//
//		int total = 100;
//		if(total <=100) {
//			
//		}
//		else {
//			
//		}
		
		
		//if-if-if-if-if-else:
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		if(browser.equals("edge")) {
			System.out.println("launch edge");
		}
		if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("plz pass the right browser name : " + browser);
		}
		
		
		//if-else if
//		String browser = "chrome";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		else if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		else if(browser.equals("edge")) {
//			System.out.println("launch edge");
//		}
//		else if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		else {
//			System.out.println("plz pass the right browser name : " + browser);
//		}
		
		
		
	}

}
