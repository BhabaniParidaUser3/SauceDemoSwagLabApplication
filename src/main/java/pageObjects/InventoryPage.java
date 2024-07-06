package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class InventoryPage extends AbstractComponent {

	WebDriver driver;

	public InventoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='inventory_item_name ']")
	List<WebElement> inventoryItemNames;
	

	@FindBy(xpath = "//button[contains(text(),'Add to cart')]")
	List<WebElement> addTocartButton;

	public void selectProduct(String ProductName) {
		for (int i = 0; i < inventoryItemNames.size(); i++) {
			String item=inventoryItemNames.get(i).getText();
			
			if (item.equalsIgnoreCase(ProductName)) {
				addTocartButton.get(i).click();
				break;
			}
			

		}
		
	}
	
	}
	
