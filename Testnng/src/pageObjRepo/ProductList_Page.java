package pageObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductList_Page 
{
	
	public static class Product_1 
	{
		
		public static WebElement electronics(WebDriver dr)
		{
			WebElement ele=null;
			
			dr.findElement(By.className("_1QZ6fC required-tracking"));
			
			
			return ele;
			
			
			
		}
		

	}

}
