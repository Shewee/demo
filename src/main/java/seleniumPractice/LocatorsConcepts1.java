package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcepts1 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//Locators Formula=Create WebElement + Perform Action
		
		//2nd approach
		//WebElement emailId = driver.findElement(By.id("input-email"));
		//WebElement passwordId = driver.findElement (By.id("input-password)"));
		
		//emailId.sendKeys("test@gmail.com");
		//passwordId.sendKeys("test@123");
		
		
		//3rd approach By Locator/OR
		//By email = By.id("input-email");
		//By password = By.id("input-password");
		
		//WebElement emailID = driver.findElement(email);
		//WebElement passwordID = driver.findElement(password);
		
		//emailID.sendKeys("naveen@gmail.com");
		//passwordID.sendKeys("test@123");
        
		
		//4th approach By locator + generic function
		
		//By emailId = By.id("input-email");
		//By passwordId = By.id("input-password");
		
		//getElement(emailId).sendKeys("naveen@gmail.com");
		//getElement(passwordId).sendKeys("test@123");
		
		//5th approach By locator + generic function for element & locator
		//By emailId = By.id("input-email");
		//By passwordId = By.id("input-password");
		
		//doSendKeys(emailId,"naveen@gmail.com");
		//doSendKeys(passwordId,"test@123");
		
		
		// 6th: By locator + generic functions for element and actions in some util
		
		//By emailId = By.id("input-email");
		//By passwordId = By.id("input-password");
		
		
		//8th - String locator + generic functions for element and actions in some util
		String emailId = "input-email";
		String passwordId = "input-password";
		
		doSendKeys("id", emailId, "naveen@gmail.com");
		doSendKeys("id", passwordId, "test@123");
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator , String Value) {
		getElement(locator).sendKeys(Value);
	}
	
	public static void doSendKeys(String locatorType, String value ,String selector) {
		By locator = getBy(locatorType, selector);
		getElement(locator).sendKeys(value);
	}

    public static By getBy(String LocatorType , String selector) {
    	By locator = null;
    	
    	switch (LocatorType.toLowerCase()) {
    	case "id":
    	locator = By.id(selector);
    	break;
    	}
    	return locator;
    }
    	
}


