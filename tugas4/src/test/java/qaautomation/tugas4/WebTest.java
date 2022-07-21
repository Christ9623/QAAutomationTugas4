package qaautomation.tugas4;

import org.testng.annotations.Test;
import org.testng.Assert;
//import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;

public class WebTest extends BaseWebTest {
	
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProductPage productPage = new ProductPage(driver, explicitWait);
	
	String username = "standard_user";
	String password = "secret_sauce";
	
	@Test
	public void testLogin() {
		
		driver.get().get("https://www.saucedemo.com/");
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginBtn();
		String actualText = productPage.getProducttext();
		String expectedText = "Sauce Labs Backpack";
		
		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void testAddProduct() {
		
		driver.get().get("https://www.saucedemo.com/");
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginBtn();
		productPage.addProduct();
		productPage.cart();
		String actualText = productPage.getCartText();
		String actualText2 = productPage.getCartText2();
		String expectedText = "Sauce Labs Backpack";
		String expectedText2 = "Sauce Labs Bike Light";
		
		Assert.assertTrue(actualText.contains(expectedText));
		Assert.assertTrue(actualText2.contains(expectedText2));
	}


}
