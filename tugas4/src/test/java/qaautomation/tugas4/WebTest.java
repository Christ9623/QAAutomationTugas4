package qaautomation.tugas4;

import org.testng.Assert;
import org.testng.annotations.Test;

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
		String expectedText = "Product";
		
		Assert.assertTrue(actualText.contains(expectedText));
	}

}
