package org.Adactin;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplebrowsermethod {
@Parameters("browser")
@Test
public void tc1(String bwrs) {
if (bwrs.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	WebDriver  driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}else  if (bwrs.equals("ie")) {
	WebDriverManager.iedriver().setup();
	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.google.co.in/");
	
}
}
}
