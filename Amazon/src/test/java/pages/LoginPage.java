package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.waitClass;

public class LoginPage 
{

	private WebDriver driver; 
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	private By userID = By.xpath("(//input[@id='ap_email_login'])");
	private By SubmitUserId = By.xpath("//input[@type='submit']");
	private By Password = By.xpath("//input[@id='ap_password']");
	private By signinBtn = By.xpath("//input[@id='signInSubmit']");
	
	public void emailorPhoneNumber()
	{
		waitClass.waitForPresence(driver , userID).sendKeys("9680573433");
		
	}
	public void ClickOnSubmit()
	{
		waitClass.waitForPresence(driver , SubmitUserId).click();
	}
	
	public void PasswordField()
	{
		waitClass.waitForPresence(driver , Password).sendKeys("Yash@2000");
	}
	public void SignInBtn()
	{
		waitClass.waitForPresence(driver , signinBtn).click();
	}

}
