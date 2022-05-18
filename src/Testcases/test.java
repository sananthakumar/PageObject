package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91999\\Downloads\\Selenium_learning\\chromedriver.exe");
		//Creating webdriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		WebElement a=driver.findElement(By.id("moneyiframe"));
		driver.switchTo().frame(a);
		driver.findElement(By.id("query")).sendKeys("reddif");
		
	}

}
