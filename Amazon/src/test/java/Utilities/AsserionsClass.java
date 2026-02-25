package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AsserionsClass 
{
	
	protected static WebDriver driver;
	
	
	public static void assertionString(String actualMsg, String expMsg) 
	{
	    try {
	        Assert.assertEquals(actualMsg, expMsg);
	        System.out.println("String is matching");
	    } catch (AssertionError e) 
	    {
	        System.out.println("String is NOT matching");
	        throw e;   // throwing error if it is not matching
	    }
	}


}
