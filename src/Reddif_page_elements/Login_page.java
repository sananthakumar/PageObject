package Reddif_page_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {
	private WebDriver driver;
	public Login_page(WebDriver driver) {
		this.driver=driver;
	}
	By username=By.id("login1");
	By password=By.id("password");
	By proceed=By.name("proceed");
	By error=By.id("div_login_error");
	By home=By.linkText("rediff.com");
	

	
	public WebElement username() {
		return driver.findElement(username);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement proceed() {
		return driver.findElement(proceed);
	}
	public WebElement error() {
		return driver.findElement(error);
	}
	public WebElement home() {
		return driver.findElement(home);
	}
}
