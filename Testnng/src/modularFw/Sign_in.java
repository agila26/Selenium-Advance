package modularFw;
import org.openqa.*;
import pageObjects.Homepge;
import pageObjects.LoginPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class Sign_in {
	public static void exec(WebDriver dr)
	{
		LoginPage.login(dr).sendKeys("agila2612@gmail.com");
		LoginPage.next(dr).click();
		LoginPage.password(dr).sendKeys("strawberry26!",Keys.ENTER);
	
	}

}
