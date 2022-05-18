package Reddif_page_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_Page_factory {
	
	private WebDriver driver;

	public Home_page_Page_factory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	By search=By.id("query");
//	By searchbtn=By.xpath("//*[@class='getqbtn']");
//	By frame=By.id("moneyiframe");
	
	
	@FindBy(id="query")
	WebElement search;
	
	@FindBy(xpath="//*[@class='getqbtn']")
	WebElement searchbtn;
	
	@FindBy(id="moneyiframe")
	WebElement frame;
	
	
	public WebElement search() {
		return search;
	}
	
	public WebElement search_button() {
		return searchbtn;
	}
	public WebElement frame() {
		return frame;
	}
	

}
