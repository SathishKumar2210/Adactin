package org.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterS {
	@Parameters({"username","password"})
	@Test
	public void method(String username,String password) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
WebElement txtuser = driver.findElement(By.id("username"));
txtuser.sendKeys(username);
WebElement txtpass = driver.findElement(By.id("password"));
txtpass.sendKeys(password);

	}

}
