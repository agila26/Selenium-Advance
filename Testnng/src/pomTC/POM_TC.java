package pomTC;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.*;


public class POM_TC
{
	
	 public  static WebDriver dr;
	 
	 public static void main(String[]args)
	 {
		 
	  dr=new FirefoxDriver();
	  dr.get("https://www.google.co.in/?gws_rd=ssl");
	  dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  dr.navigate().to(c);
	  dr.manage().window().maximize();
	 
	  LoginPage.login(dr).sendKeys("agila2612@gmail.com",Keys.ENTER);
	  LoginPage.password(dr).sendKeys("strawberry26!",Keys.ENTER);
	  Homepge.social(dr).click();
	  Homepge.logout(dr).click();
	  Homepge.logout1(dr).click();
	  dr.quit();
	
	
	 }
}
