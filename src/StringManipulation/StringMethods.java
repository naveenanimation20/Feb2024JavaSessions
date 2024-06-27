package StringManipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String str = "this is my java code and i am so happy";
		
		System.out.println(str.length());//38
		
		System.out.println("Li = " + 0  );
		System.out.println("Hi = " + (str.length() -1) );
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(8));
		//System.out.println(str.charAt(-1));//StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf('t'));
		System.out.println(str.indexOf('i'));//1st occurrence of i		
		//System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nd occurrence of i
		
		System.out.println("---------");
		
		
		
		System.out.println(str.indexOf("java"));
		
		System.out.println(str.indexOf("naveen"));//-1
		
		String username = "admin";
		String mesg = "welcome " + username;
		
		if(mesg.indexOf("admin") == 8) {
			System.out.println("user name is present");
		}
		else {
			System.out.println("user name is not found");
		}

		//lower and upper case:
		String test = "selenium automation";
		String pop = "SELENIUM TESTING";
		System.out.println(test.toUpperCase());
		System.out.println(pop.toLowerCase());
		
		//trim:
		String un = "  test automation   ";
		System.out.println(un.trim());
		
		
		//replace:
		String dob = "01-01-1990"; //01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		String loop = "I love testing";
		System.out.println(loop.replaceAll("love", "enjoy"));
		
		System.out.println("automation".replace("a", "P"));
		
		//contains:
		String messg = "admin welcome";
		System.out.println(messg.contains("admin"));//true
		
		String url = "https://naveenautomationlabs.com/opencart/index.php?route=product/search&search=macbook";
		System.out.println(url.contains("search=macbook"));
		
		//equals:
		String t1 = "hello selenium";
		String t2 = "hello Selenium";
		System.out.println(t1.equals(t2));//false
		System.out.println(t1.equalsIgnoreCase(t2));
		
		//split:
		
		String lang = "JAVA_PYTHON_JAVASCRIPT_RUBY";
		String lg[] = lang.split("_");
		
		System.out.println(lg[0]);
		
		System.out.println(Arrays.toString(lg));
		
		
		String data = "xXTestingXxXSeleniumXXxXAutomatonxXxJavaX";		
		String d[] = data.split("xX");
		
		System.out.println(d[0].length());
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);
		
		
		
//		String rest = "testing | automation | cypress | selenium";
//		String r[] = rest.split("\\|");
//		System.out.println(r[0]);
//		System.out.println(r[1]);

		String pest = "testing.automation.cypress.selenium";
		String p[] = pest.split("\\.");
		System.out.println(p[0]);
		
		String empData = "Tom;peter;30;IBM;Banaglore;India";
		String emp[] = empData.split(";");
		System.out.println(emp[0]);
		
		
		//
		String word = "I love \"java\" coding"; //I love "java" coding
		System.out.println(word);
		
		String w = "I love 'java' coding";
		System.out.println(w);
		
		String xpath = "//input[@id=\"firstname\"]";
		System.out.println(xpath);   
		
		String x = "//input[@id=first\\name]";
		System.out.println(x);
		
		
		String k = "  h    ello   tes   ting   ";
		System.out.println(k.replaceAll("\\s+", " "));
		
		String me = "welcome admin";
		System.out.println(me.replace("admin", "seller"));

	}

}
