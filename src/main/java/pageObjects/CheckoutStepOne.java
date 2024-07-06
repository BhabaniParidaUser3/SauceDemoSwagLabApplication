package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOne {
	
WebDriver driver;
	public CheckoutStepOne(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
   
	}
	
	 @FindBy(css="#first-name")
	 WebElement firstName ;
	 
	 @FindBy(css="#last-name")
	 WebElement lastName ;
	 
	 @FindBy(css="#postal-code")
	 WebElement postalCode ;
	 
	 @FindBy(css="#continue")
	 WebElement cont;
	 
	 public CheckoutStepTwo filldataAndClickonContinue()
	 {
		 firstName.sendKeys("Bhabani");
		 lastName.sendKeys("Parida");
		 postalCode.sendKeys("769010");
		 cont.click();
		 CheckoutStepTwo CheckoutStepTwo=  new CheckoutStepTwo(driver);
		 return CheckoutStepTwo;
		 
	 }
	 

}
