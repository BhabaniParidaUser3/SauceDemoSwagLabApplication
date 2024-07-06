package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css="#user-name")
	WebElement userName;
	
	@FindBy (css="#password")
	WebElement password;
	
	@FindBy (css="#login-button")
	WebElement login;
	
	public InventoryPage LoginApplication(String username,String credential)
	{
		userName.sendKeys(username);
		password.sendKeys(credential);
		login.click();
		InventoryPage inventoryproduct=new InventoryPage(driver);
		return inventoryproduct;
	}
	
	public void goTo()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	

}
