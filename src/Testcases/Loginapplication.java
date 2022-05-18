package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Reddif_page_elements.Home_page;
import Reddif_page_elements.Login_page;

public class Loginapplication {

	@Test()
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91999\\Downloads\\Selenium_learning\\chromedriver.exe");
		//Creating webdriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Login_page lp=new Login_page(driver);
		lp.username().sendKeys("Ananthakumar@gmail.com");
		lp.password().sendKeys("kumar@123");
		Thread.sleep(2000);
		lp.proceed().click();
		String res=lp.error().getText();
		System.out.println(res);
		lp.home().click();
		
		//Cretaing object for homepage class
		Home_page hp=new Home_page(driver);
		driver.switchTo().frame(hp.frame());
		hp.search().sendKeys("reddif");
		hp.search_button().click();
		System.out.println(driver.getTitle());
		driver.close();
		Assert.assertEquals("Wrong username and password combination.", res);
		
	}
}
