package framwrk;
import org.openqa.selenium.*;
import org.testng.asserts.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadrvn {
WebDriver dr;
	@Test(dataProvider="Facebook")
	public void loginFb(String un,String pw)
	{
		dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("www.gmail.com");
		//dr.findElement(arg0);
		//System.out.println(dr.getTitle());
		Assert.assertSame(dr.getTitle(),"Problem loading page");
		
		System.out.println("failed");
	
		
		
	}	
		@AfterMethod
		public void end()
		{
			dr.quit();
		}
	
		
		
		
		
		
		@DataProvider(name="Facebook")
		public Object[][]
				
				
			passDta()
		{
			
			// this will execute twice because we r providing 2 set of data
			Object[][]data =new Object[2][2];
			data [0][0]="admin";
			data [0][1]="123";
			data[1][0]="agila2612@gmail.com";
			data [1][1]="abcd";
			
			return data;
		}
		
		
	
		}
