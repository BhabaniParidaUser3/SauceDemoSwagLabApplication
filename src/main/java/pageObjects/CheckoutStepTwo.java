package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwo {

	WebDriver driver;
	public CheckoutStepTwo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#finish")
	 WebElement FinishButton ;
	
	public CheckoutComplete clickOnFinsh()
	{
		FinishButton.click();
		CheckoutComplete checkoutComplete=new CheckoutComplete(driver);
		return checkoutComplete;
	}

}
