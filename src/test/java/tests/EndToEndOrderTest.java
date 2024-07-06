package tests;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckoutComplete;
import pageObjects.CheckoutStepOne;
import pageObjects.CheckoutStepTwo;
import pageObjects.InventoryPage;
import pageObjects.LandingPage;
import testComponents.BaseTest;

public class EndToEndOrderTest extends BaseTest{

	
	@Test
	public void Submitorder() throws IOException
	{
		InventoryPage inventoryPage=landingPage.LoginApplication("standard_user", "secret_sauce");
		inventoryPage.selectProduct("Sauce Labs Fleece Jacket");
		CartPage cartpage=inventoryPage.goToCartPage();
		CheckoutStepOne checkoutStepOne=cartpage.goToCheckOutPage();
		CheckoutStepTwo checkoutStepTwo=checkoutStepOne.filldataAndClickonContinue();
		CheckoutComplete checkoutComplete=checkoutStepTwo.clickOnFinsh();
		String confirmMessage=checkoutComplete.getConfirmationPage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thank you for your order!"));
				
	}
	

	
}
