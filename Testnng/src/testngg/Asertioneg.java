package testngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Asertioneg {
	
	@Test
	public void tst()
		{
	
	WebDriver dr=new FirefoxDriver();
	dr.get("https://www.google.co.in/?gws_rd=ssl");
	dr.manage().window().maximize();
	Assert.assertEquals( dr.getTitle(),"Googl","Title not matching.");
	// the program terminates here because the result is fail,
	// assert will never execute next lines if the condition is false
	
	// see assrt pgm to deal with this issue
	System.out.println("hi");
	
	dr.close();
	}	
	
}
