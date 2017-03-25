package framwrk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class Proprtycncpt {
//
//	properties file is always under main project and not under sub-package or class
//	properties saves data in the form of key-value pair.
	
	FileInputStream fs;
	Properties pr;
	  
	
	@Test
	public void testprpty() throws IOException
	{
		fs=new FileInputStream("config.Properties");
		pr=new Properties();
		pr.load(fs);
		System.out.println(pr.getProperty("name"));
		System.out.println(pr.getProperty("url"));
		
		}
	
	
	
	

	
	
	
	
}
