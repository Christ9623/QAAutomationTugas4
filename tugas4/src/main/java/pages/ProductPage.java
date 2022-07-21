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
