package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutComplete {

	WebDriver driver;
	public CheckoutComplete(WebDriver driver) {
       this.driver=driver;
       PageFactory.initElements(driver, this);
       
	}
	
	@FindBy(css=".complete-header")
	WebElement message;
	
	public String getConfirmationPage()
	{
		return message.getText();
	}

	

}
