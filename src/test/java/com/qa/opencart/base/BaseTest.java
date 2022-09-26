package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.SearchResultPage;
import com.qa.opencart.pages.productInfoPage;

public class BaseTest {
	public WebDriver driver;
	public Properties prop;
	public DriverFactory df;
	
	public LoginPage loginpage;
	public AccountsPage accpage;
	public SearchResultPage searchResPage; 
	public productInfoPage productInfoPage;
	
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		prop = df.initProp();
		//String browserName = prop.getProperty("browser");
		driver = df.intDriver(prop);
		loginpage = new LoginPage(driver);
		
	}
	
	
	
	//@AfterTest
	//public void teardown() {
		//driver.quit();
		
	}

//}
