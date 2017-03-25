package modularFw;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import modularFw.Sign_in;
import pageObjects.*;

public class Module_TC {
	private static WebDriver dr=null;
	
	public static void main(String[]args)
	{
		dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("http://www.gmail.com");
		Sign_in.exec(dr);
		dr.close();
		System.out.println("Login Success");
		
		
		}
	

}
