package Reddif_page_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_page {
	
	private WebDriver driver;

	public Home_page(WebDriver driver) {
		this.driver=driver;
	}
	
	By search=By.id("query");
	By searchbtn=By.xpath("//*[@class='getqbtn']");
	By frame=By.id("moneyiframe");
	
	
	public WebElement search() {
		return driver.findElement(search);
	}
	
	public WebElement search_button() {
		return driver.findElement(searchbtn);
	}
	public WebElement frame() {
		return driver.findElement(frame);
	}
	

}
