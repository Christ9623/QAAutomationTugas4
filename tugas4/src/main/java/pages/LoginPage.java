package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");
	
	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public void inputUsername(String user) {
		
		setText(username, user);
		
	}
	
	public void inputPassword(String pass) {
		
		setText(password, pass);
		
	}
	
	public void clickLoginBtn() {
		
		clickAndWait(loginBtn);
	}



}
