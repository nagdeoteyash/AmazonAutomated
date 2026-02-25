package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.AsserionsClass;
import Utilities.waitClass;

public class CartPage
{
	
	private WebDriver driver; 
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	
	private By ShoppinhHeading = By.xpath("//h2[@id=\"sc-active-items-header\"]");
	private By ProceedToBuyBtn =By.xpath("(//input[@name='proceedToRetailCheckout'])[1]");
	public String ShoppingcartHeading()
	{
		String ShoppingHeadinhH2=waitClass.waitForPresence(driver, ShoppinhHeading).getText();
		return ShoppingHeadinhH2;
	}
	
	public void AssertShoppingHeading()
	{
		String ExpectedHeading="Shopping Cart";
		AsserionsClass.assertionString( ShoppingcartHeading(), ExpectedHeading);
	}
	
	public void ProceedToBuyButton()
	{
		waitClass.waitForPresence(driver, ProceedToBuyBtn).click();
		
	}
	
	
	
}
