package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.AsserionsClass;
import Utilities.waitClass;

public class MobileAddedInCart 
{

	private WebDriver driver; 
	public MobileAddedInCart(WebDriver driver)
	{
		this.driver=driver;
		
	}

	private By bargainText = By.xpath("//h1[text()='Bargain recommendations']") ;
	private By BargainList1 = By.xpath("//div[@id='anonCarousel1']/ol/li[1]//input[@name='submit.addToCart']");
	private By BargainList2 = By.xpath("//div[@id='anonCarousel2']/ol/li[1]//input[@name='submit.addToCart']");
 	private By CartButton = By.xpath("//div[@id='nav-cart-count-container']");
	
	
	public void BargainText()
	{
		
		String BargaintextToAssert=waitClass.waitForPresence(driver , bargainText ).getText();
		//System.out.println("bargain text   = " + BargaintextToAssert);
		String ActualBargainText = "Bargain recommendations";
		 AsserionsClass.assertionString(BargaintextToAssert, ActualBargainText);
	}
	 
	public void AddBargainThingToCart1()
	{
		waitClass.waitForPresence(driver ,BargainList1).click();
		
	}
	public void AddBargainThingToCart2()
	{
		waitClass.waitForPresence(driver ,BargainList2).click();
	}
	
	public void ClickOnTheCartButton()
	{
		waitClass.waitForPresence(driver ,CartButton).click();
	}
	

}
