package abstractComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageObjects.CartPage;
import pageObjects.MenuPage;

public class AbstractComponent {
	WebDriver driver;
	public AbstractComponent(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(css=".shopping_cart_link")
	WebElement cart;
	
	@FindBy(css="#react-burger-menu-btn")
	WebElement menu;
	
	public CartPage goToCartPage()
	{
		cart.click();
		CartPage cartpage=new CartPage(driver);
		return cartpage;
		
	}
	
	public MenuPage goToMenuPage()
	{
		menu.click();
		MenuPage menupage=new MenuPage(driver);
		return menupage;
	}
	

}
