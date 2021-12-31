package org.Adactin;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data {
	WebDriver driver;
	
	@BeforeMethod
	public void browserconfigiration() {
WebDriverManager.chromedriver().setup();
  driver = new  ChromeDriver();
driver.get("https://adactinhotelapp.com/");
	}
	@Test(dataProvider="data")
	public void tc(String email,String pass) {
	WebElement txtmail = driver.findElement(By.id("username"));
	txtmail.sendKeys(email);
	WebElement txtpass = driver.findElement(By.id("password"));
	txtpass.sendKeys(pass);
    WebElement btnlogin = driver.findElement(By.name("login"));
    btnlogin.click();
    
	}
	@DataProvider(name="data")
	public Object [][] data() {
		return new Object[][] {
			{"user1","password1"},
			{"user2","password2"},
			{"user3","password3"},
			{"user4","password4"}

				
	};

}
	@AfterMethod
	public void closebrowser() {
driver.close();
	}
}