package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	 
	public String read_data_from() throws Throwable
	{
	
	FileInputStream fi = new FileInputStream("./src/main/resources/propertyfile.properties");
	Properties p = new Properties();
		  p.load(fi);
		  String value = p.getProperty("url");
		  return value;
}
		  
			
		
	

}
