package PropertiesConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {

	private final String CONFIG_FILE_PATH = "./src/PropertiesConcept/config.properties";
	private Properties prop;

	public Properties initProperties() {
		try {
			FileInputStream ip = new FileInputStream(CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}

}

