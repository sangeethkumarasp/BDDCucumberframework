package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {

	private Properties prop;
	
	
	/**
	 * @author sangeeth
	 * This method is used to load properties file where we will get urls and browser instances 
	 *
	 */
	
	public Properties init_prop()
	{
		prop=new Properties();
		try {
			FileInputStream fis =new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
	
	
	
	
	
}
