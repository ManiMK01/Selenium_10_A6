package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Manikandan
 */

public class FileUtility {
	
	/**
	 * This method will read data from property file and return value to the caller
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getFromProperties(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
		}
}
