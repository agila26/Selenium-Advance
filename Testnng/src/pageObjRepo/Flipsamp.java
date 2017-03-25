package pageObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipsamp {
	public static void main(String[]args)
	
	//to click on the item of the drop down menu 
	//One way of doing this is by using Action class
	
	/*With some of the browser it happens that once mouse hover action is performed,
	the menu list disappear with in the fractions of seconds before Selenium identify 
	the next submenu item and perform click action on it. 
	 In that case it is better to use ‘perform()’ action on the main menu to hold the menu
	  list till the time Selenium identify the sub menu item and click on it.
	  another way-
	   	Actions action = new Actions(driver);
 		action.moveToElement(element).perform();
        WebElement subElement = driver.findElement(By.linkText("iPads"));
 		action.moveToElement(subElement);
  		action.click();
 		action.perform(); used in this pgm**/
	
	{

		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.flipkart.com/");
		dr.manage().window().maximize();
		Actions action=new Actions(dr);
		
		WebElement ele =dr.findElement(By.xpath("//a[@title='Electronics']"));
		
		action.moveToElement(ele).perform();
		//action.clickAndHold();
		WebElement subele=dr.findElement(By.xpath("//a[contains(.,'Smart Watch')]"));
		action.moveToElement(subele).perform();
		action.clickAndHold();
		
		//WebElement subel=dr.findElement(By.xpath("//li[@class='c-item']"));
		//action.moveToElement(subel);
		//action.perform();
		//action.click();
		
		
	  //  dr.close();
		
	}
}
		
		


