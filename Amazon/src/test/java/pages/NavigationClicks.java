package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.waitClass;

public class NavigationClicks 

{
	private WebDriver driver;  // driver we can user in this class
	
	
	public NavigationClicks(WebDriver driver) //constructor for driver reciever
	{
		this.driver = driver;
	}
	
	
	private By TagNameMobile = By.xpath("//div [@id='nav-xshop']/ul/li[5]"); // Find element method
	
	public void ClickMobile()  // its action class
	{
		waitClass.waitForPresence(driver, TagNameMobile).click();
		
	}
	

}
