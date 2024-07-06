package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		super(driver);
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#checkout")
	WebElement checkoutBtn;
	
	public CheckoutStepOne goToCheckOutPage()
	{
		checkoutBtn.click();
		CheckoutStepOne CheckoutStepOne=new CheckoutStepOne(driver);
		return CheckoutStepOne;
		
	}

}
