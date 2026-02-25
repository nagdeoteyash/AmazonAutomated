package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.AsserionsClass;
import Utilities.javaScriptExecuterClass;
import Utilities.waitClass;

public class ClickedMobilePage
{
	private WebDriver driver; 
	public ClickedMobilePage(WebDriver driver)
	{
		this.driver=driver;
	}

	private By CartButton = By.xpath("(//input[@id='add-to-cart-button'])[2]") ;
	
	
	public void ScrollTillCartButtonVisible()
	{
		javaScriptExecuterClass.ScrollByPixel(driver);
	}
	
	public void AddToCartButton()
	{
		ScrollTillCartButtonVisible();
		waitClass.waitForPresence(driver, CartButton).click();
		//driver.findElement(CartButton).click();
		
	}
	
	public void AssertTheCartButtonText()
	{
		waitClass.waitForPresence(driver, CartButton).getText();
		String ActualCartButtonText = waitClass.waitForPresence(driver, CartButton).getText(); //driver.findElement(CartButton).getText();
		String ExpectedCartButtonText = "Add to cart";
		AsserionsClass.assertionString(ActualCartButtonText, ExpectedCartButtonText);
	}
	
}
