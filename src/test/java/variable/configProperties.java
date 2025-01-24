package variable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configProperties {

	public static Properties property;
	private static String configpath="C:\\Users\\Taurus11\\Desktop\\MobileAppium\\com.unionmutualproject\\src\\test\\resources\\config.properties";
	
	public static void initializePropertyFile()
	{
		property = new Properties();
		try {
			FileInputStream instm = new FileInputStream(configpath);
			property.load(instm);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
