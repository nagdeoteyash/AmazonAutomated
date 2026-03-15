package tests;


import org.testng.annotations.Test;


import baseSetup.BaseBrowserinitClass;
import pages.CartPage;
import pages.ClickedMobilePage;
import pages.LoginPage;
import pages.MobileAddedInCart;
import pages.MobileSectionPage;
import pages.NavigationClicks;

public class MobileAddToCart_TC_01 extends BaseBrowserinitClass
{
		
	@Test(priority=1)
	public static void MobileClickAndMsgAssert()
	{
		NavigationClicks ClickOnMobile = new NavigationClicks(driver);
		ClickOnMobile.ClickMobile();
		MobileSectionPage M1=new MobileSectionPage(driver);
		M1.scrollupto();   // It will scroll till the msg 
		M1.MsgAssertion(); //Assertions
		
	}
	
	@Test(priority=2)
	public void ClickedOn3rdMobile()
	{
		NavigationClicks ClickOnMobile = new NavigationClicks(driver);
		ClickOnMobile.ClickMobile();
		MobileSectionPage M1=new MobileSectionPage(driver);
		M1.scrollupto();         
		M1.ClickOnThirdMobile(); 
		M1.AssertClickOnThirdMobile();
	}
	
	
	@Test(priority=3)
	public void AddtToCartButton()
	{
		NavigationClicks ClickOnMobile = new NavigationClicks(driver);
		ClickOnMobile.ClickMobile();
		MobileSectionPage M1=new MobileSectionPage(driver);
		M1.scrollupto();
		M1.ClickOnThirdMobile();
		ClickedMobilePage clickoncart = new ClickedMobilePage(driver);
		clickoncart.AddToCartButton();        // will scroll and click on add to cart button
		clickoncart.AssertTheCartButtonText();// assertion for cart buttton text  
	}
	
	@Test(priority = 4)
	public void BargainPage()
	{
		NavigationClicks ClickOnMobile = new NavigationClicks(driver);
		ClickOnMobile.ClickMobile();
		MobileSectionPage M1=new MobileSectionPage(driver);
		M1.scrollupto();
		M1.ClickOnThirdMobile();
		ClickedMobilePage clickoncart = new ClickedMobilePage(driver);
		clickoncart.AddToCartButton();  
		MobileAddedInCart maic =new MobileAddedInCart(driver);
		maic.BargainText();
	}
	
	@Test(priority = 4)
	public void BargainThingsAddedInCart()
	{
		NavigationClicks ClickOnMobile = new NavigationClicks(driver);
		ClickOnMobile.ClickMobile();
		MobileSectionPage M1=new MobileSectionPage(driver);
		M1.scrollupto();
		M1.ClickOnThirdMobile();
		ClickedMobilePage clickoncart = new ClickedMobilePage(driver);
		clickoncart.AddToCartButton();  
		MobileAddedInCart maic =new MobileAddedInCart(driver);
		maic.BargainText();
		maic.AddBargainThingToCart1();
		maic.AddBargainThingToCart2();
		maic.ClickOnTheCartButton();
		CartPage CBtn =new CartPage(driver);
		CBtn.AssertShoppingHeading();
	}
	
	@Test(priority = 5)
	public void AddToCartPageHeadingAssert()
	{
		NavigationClicks ClickOnMobile = new NavigationClicks(driver);
		ClickOnMobile.ClickMobile();
		MobileSectionPage M1=new MobileSectionPage(driver);
		M1.scrollupto();
		M1.ClickOnThirdMobile();
		ClickedMobilePage clickoncart = new ClickedMobilePage(driver);
		clickoncart.AddToCartButton();  
		MobileAddedInCart maic =new MobileAddedInCart(driver);
		maic.BargainText();
		maic.AddBargainThingToCart1();
		maic.AddBargainThingToCart2();
		maic.ClickOnTheCartButton();
		CartPage CBtn =new CartPage(driver);
		CBtn.AssertShoppingHeading();
	}
	
	@Test(priority = 5)
	public void ProceedToPayTillPayment()
	{
		NavigationClicks ClickOnMobile = new NavigationClicks(driver);
		ClickOnMobile.ClickMobile();
		MobileSectionPage M1=new MobileSectionPage(driver);
		M1.scrollupto();
		M1.ClickOnThirdMobile();
		ClickedMobilePage clickoncart = new ClickedMobilePage(driver);
		clickoncart.AddToCartButton();  
		MobileAddedInCart maic =new MobileAddedInCart(driver);
		maic.BargainText();
		maic.AddBargainThingToCart1();
		maic.AddBargainThingToCart2();
		maic.ClickOnTheCartButton();
		CartPage CBtn =new CartPage(driver);
		CBtn.ProceedToBuyButton();
		LoginPage login =new LoginPage(driver);
		login.emailorPhoneNumber();
		login.ClickOnSubmit();
		login.PasswordField();
		login.SignInBtn();
	}
	
	@Test(priority = 6)
	public void gitpullrequestExample()
	{
		System.out.println("git pull request ");
	}


	@ Test ( prority = 7 )
	public void gitpullrequestExample()
	{
		System.out.println("git push request ");
		System.out.println(" editing this file in git and will be pulled in our local system. ");

		
	}
}
