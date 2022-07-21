package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {
	
	//By productText = By.xpath("//span[@class='title']");
	By productText = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");

	public ProductPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public String getProducttext() {
		
		return getText(productText);
		
	}
	
	

}
