package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {
	
	//By productText = By.xpath("//span[@class='title']");
	By productText = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
	By cart = By.xpath("//a[@class='shopping_cart_link']");
	By addProduct1 = By.id("add-to-cart-sauce-labs-backpack");
	By addProduct2 = By.id("add-to-cart-sauce-labs-bike-light");
	By cartText = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
	By cartText2 = By.xpath("//div[normalize-space()='Sauce Labs Bike Light']");
	By COProduct = By.id("checkout");
	By Continue = By.id("continue");
	By Finish = By.id("finish");
	By UserDetail = By.id("first-name");
	By UserDetail2 = By.id("last-name");
	By UserDetail3 = By.id("postal-code");
	By SuccessText = By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']");

	public ProductPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public String getProducttext() {
		
		return getText(productText);
		
	}
	
	public String getCartText() {
		
		return getText(cartText);
		
	}
	
	public String getCartText2() {
		
		return getText(cartText2);
		
	}
	
	public void addProduct() {
		
		clickAndWait (addProduct1);
		clickAndWait (addProduct2);
		
	}
	
	public void checkoutProduct() {
		
		clickAndWait(COProduct);
		
	}
	
	public void inputDetail(String first, String last, String ZIP) {
		
		setText(UserDetail, first);
		setText(UserDetail2, last);
		setText(UserDetail3, ZIP);
		
	}
	
	public void checkoutContinue() {
		
		clickAndWait(Continue);
		
	}
	
	public void checkoutPayment() {
		
		clickAndWait(Finish);
		
	}
	
	public String getPaymentSuccess() {
		
		return getText(SuccessText);
		
	}
	
	
//	public void addProduct1() {
//		
//		clickAndWait (addProduct1);
//		
//	}
//	
//	public void addProduct2() {
//		
//		clickAndWait (addProduct2);
//		
//	}
	
	public void cart() {
		
		clickAndWait (cart);
		
	}
	
	

}
