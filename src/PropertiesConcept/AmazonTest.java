package PropertiesConcept;

import java.util.Properties;

public class AmazonTest {

	public static void main(String[] args) {

		PropReader reader = new PropReader();
		Properties prop = reader.initProperties();

		String browserName = prop.getProperty("browser");

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launched");
			break;
		case "firefox":
			System.out.println("ff is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;

		default:
			System.out.println("plz pass the right browser...");
			break;
		}
		
		System.out.println(prop.getProperty("url"));
		
		System.out.println("enter username : " + prop.getProperty("username"));
		System.out.println("enter password : " + prop.getProperty("password"));
		System.out.println("click on Login button");

		
	}

}
