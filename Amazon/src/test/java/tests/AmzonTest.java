package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmzonTest 
{
	public static void main (String [] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement e1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [@id='nav-xshop']/ul/li[5]")));
		e1.click();

		//scrolling to 
		//"//span[@class='dcl-truncate d-header-title'] /span[text()='Top smartphone deals for you']"
		WebElement scroll_Upto = driver.findElement(By.xpath("//span[@class='dcl-truncate d-header-title'] /span[text()='Top smartphone deals for you']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",scroll_Upto);
		
		
		// 3rd mobile = xpath = //div[@class='a-carousel-viewport']/ol/li[3]
		String thirdrdMobile = driver.findElement(By.xpath("//div[@class='a-carousel-viewport']/ol/li[3]")).getText();
		System.out.print(thirdrdMobile); // assert this  text 
		
		
		driver.findElement(By.xpath("//div[@class='a-carousel-viewport']/ol/li[3]")).click(); //click on the 3rd mobile

		 js.executeScript("window.scrollBy(0, 250)");		 
		 driver.findElement(By.xpath("(//input[@id=\"add-to-cart-button\"])[2]")).click();
		 
	}
	

}
