package testngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assrt {

	@Test
	public void tsts()
		{
	
	WebDriver dr=new FirefoxDriver();
	dr.get("https://www.google.co.in/?gws_rd=ssl");
	dr.manage().window().maximize();
	try{
	Assert.assertEquals( dr.getTitle(),"Googl","Title not matching.");
	}
	// always use throwable for assert because it's an error not an exception.
	catch(Throwable e){
		e.printStackTrace();
		System.out.println("hi");
	}
	
	
	dr.close();
}
}
