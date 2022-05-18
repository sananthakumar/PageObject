package Reddif_page_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_Page_factory {
	private WebDriver driver;
	public Login_page_Page_factory(WebDriver driver) {
		this.driver=driver;
	}
//	By username=By.id("login1");
//	By password=By.id("password");
//	By proceed=By.name("proceed");
//	By error=By.id("div_login_error");
//	By home=By.linkText("rediff.com");
	
	@FindBy(id="login1")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	
	@FindBy(name="proceed")
	WebElement proceed;
	
	@FindBy(id="div_login_error")
	WebElement error;
	
	@FindBy(linkText="rediff.com")
	WebElement home;
	

	
	public WebElement username() {
		return username;
	}
	public WebElement password() {
		return password;
	}
	public WebElement proceed() {
		return proceed;
	}
	public WebElement error() {
		return error;
	}
	public WebElement home() {
		return home;
	}
}
