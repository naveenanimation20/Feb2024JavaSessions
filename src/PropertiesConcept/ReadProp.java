package PropertiesConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public final static String CONFIG_FILE_PATH = "./src/PropertiesConcept/config.properties";
	static Properties prop;

	public static void main(String[] args) {

		try {
			FileInputStream ip = new FileInputStream(CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);//chrome

		String appURL = prop.getProperty("url");
		System.out.println(appURL);

		String n1 = prop.getProperty("naveen");
		System.out.println(n1);
		
		prop.setProperty("browser", "Firefox");
		browserName = prop.getProperty("browser");//Firefox
		System.out.println(browserName);
		
		prop.setProperty("version", "99.0");
		String version = prop.getProperty("version");
		System.out.println(version);

		System.out.println(prop.size());

	}

}
