package com.qa.opencart.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
public WebDriver driver;
public Properties prop;
/**
 * this method is used to initialize the driver on the basis of given browser name
 * @param prop
 * @return this return driver
 */
	
	public WebDriver intDriver(Properties prop) {
		
		String browserName = prop.getProperty("browser");
		System.out.println("browser name is : " + browserName);
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else {
			System.out.println("Please pass the right browser" +browserName);
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		return driver;
	}
/**this returns properties references with all config properties
 * @return 
 * 	@return this returns properties references
 */
	
	public Properties initProp() {
		prop = new Properties();
		
		 try {
			FileInputStream  ip = new FileInputStream("src/test/resources/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return prop;
	}
	/**
	 * take screenshot
	 */
	
	public static String getScreenshot() {
		File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		
		String path = "./screenshot"+System.currentTimeMillis()+".png";
		
		File destination = new File(path);
		
		try {
		FileUtils.copyDirectory(scrFile, destination);
		} catch(IOException e) {
			e.printStackTrace();
		}
		return path;
	}
	private static TakesScreenshot getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
		
		
		
		
		
		
		
	}


