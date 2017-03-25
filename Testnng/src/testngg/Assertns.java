package testngg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertns {
	@Test
	public void tst()
	{
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		String actualtitle= dr.getTitle();
		String expectedtitle="Facebook - Log In or Sign U";
		System.out.println(actualtitle);
		if(actualtitle == expectedtitle)
		{
			System.out.println("True");
		}
		else{
			System.out.println("false");
		}
	// assertion gives the below error and says test is failed based on result so always use assertion 
		// expected [Facebook - Log In or Sign U] but found [Facebook - Log In or Sign Up]-
		Assert.assertEquals(actualtitle, expectedtitle);
		dr.close();
		
		
	}

}
