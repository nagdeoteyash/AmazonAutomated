package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javaScriptExecuterClass
{
	protected static WebDriver driver;
	static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public static void ScrollByPixel(WebDriver driver) 
	{
        ((JavascriptExecutor) driver)
            .executeScript("window.scrollBy(0,500)");
    }
	public static void ScrollByElement(WebElement scroll_Upto)
	{
		try {
			js.executeScript("arguments[0].scrollIntoView(true);",scroll_Upto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	

}
