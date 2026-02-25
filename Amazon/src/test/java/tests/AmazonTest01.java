package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AmazonTest01 
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
		 driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		 
		 String Bargain=driver.findElement(By.xpath("//h1[text()='Bargain recommendations']")).getText();
		 System.out.println("bargain text   = " +Bargain);
		 
		 
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//div[@id=\"anonCarousel1\"]/ol/li[1]//input[@name=\"submit.addToCart\"]")).click(); //Add 1st thing of bargainlist to cart
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//div[@id=\"anonCarousel2\"]/ol/li[1]//input[@name=\"submit.addToCart\"]")).click();
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//div[@id=\"nav-cart-count-container\"]")).click();
		 Thread.sleep(200);
		 driver.findElement(By.xpath("(//input[@name=\"proceedToRetailCheckout\"])[1]")).click();
		 Thread.sleep(200);
		 driver.findElement(By.xpath("(//input[@id=\"ap_email_login\"])")).sendKeys("9680573433");
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(200);
		 Thread.sleep(200);
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Yash@2000");
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		 Thread.sleep(200);
		 Thread.sleep(200);
		String PaymentFirstMsg= driver.findElement(By.xpath("//a[@id=\"nav-checkout-title-header-text\"]")).getText();
		System.out.println("secure checkout message display = "+PaymentFirstMsg);
		Thread.sleep(200);
		String PaymentConfirm =driver.findElement(By.xpath("//div[@id=\"checkout-paymentOptionPanel\"]//h2")).getText();
		System.out.print("Payment Page confirmation = "+PaymentConfirm);
	
	}
}
	


