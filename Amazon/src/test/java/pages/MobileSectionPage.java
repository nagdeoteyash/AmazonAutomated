package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.AsserionsClass;
import Utilities.javaScriptExecuterClass;
import Utilities.waitClass;




public class MobileSectionPage 
{
	private WebDriver driver; 
	public MobileSectionPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By ActualMsg = By.xpath("//span[@class='dcl-truncate d-header-title'] /span[text()='Top smartphone deals for you']");
	private By thirdrdMobile = By.xpath("//div[@class='a-carousel-viewport']/ol/li[3]");
	private By MobileActualText = By.xpath("//span[@id=\"productTitle\"]");
	
	public void scrollupto() 
	{
		
		WebElement scroll_Upto = waitClass.waitForPresence(driver , ActualMsg );
		javaScriptExecuterClass.ScrollByElement(scroll_Upto);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",scroll_Upto);
		
	}
	
	public void MsgAssertion()
	{
		String ActualMsg1 = driver.findElement(ActualMsg).getText();
		String ExpMsg = "Top smartphone deals for you";
		AsserionsClass.assertionString(ActualMsg1, ExpMsg);
	}
	
	public void ClickOnThirdMobile()
	{
		waitClass.waitForPresence(driver, thirdrdMobile).click(); 	//using wait 
		 // driver.findElement(thirdrdMobile).click();   			//HardCoded click action
		
	}
	
	public void AssertClickOnThirdMobile()
	{
		String ActualMobileText = driver.findElement(MobileActualText).getText();
		String ExptedAmobileText = "Motorola G57 Power 5G (Fluidity, 8GB RAM, 128GB Storage)"
				+ "| Snapdragon 6s Gen 4 Processor |"
				+ " 6.72\" FHD+ Display | 50MP LYT-600 + 8MP Ultrawide "
				+ "| 8MP Selfie Camera | 7000mAh Battery, 33W TurboPower |"  // just add TurboPower for pass this case
				+ " IP64";
		AsserionsClass.assertionString(ActualMobileText,ExptedAmobileText ); //it will fail example for failed case
	}
}

