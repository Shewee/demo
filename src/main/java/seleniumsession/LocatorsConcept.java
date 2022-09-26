package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
static WebDriver driver;

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
		 //Locators Formula=Create WebElement + Perform Action
		 
	//1.
	//driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
	//driver.findElement(By.id("input-password")).sendKeys("test@123");
	
	
	//2.
	//WebElement emailid = driver.findElement(By.id("input-email"));
	//WebElement password = driver.findElement(By.id("input-password"));
	//emailid.sendKeys("naveen@gmail.com");
	//password.sendKeys("test@123");
	
	
	//3.By Locator (Object Repository)
	
	//By emailId = By.id("input-email");
	//By password = By.id("input-password");
	
	//WebElement emailEle  = driver.findElement(emailId);
	//WebElement passwordEle  = driver.findElement(password);
	
	//emailEle.sendKeys("naveen@gmail.com");
	//passwordEle.sendKeys("test@123");
	
		 
	//4.By Locator + generic function
		 
	//By emailId = By.id("input-email");
	//By password = By.id("input-password");	 
		 
	//getElement(emailId).sendKeys("naveen@gmail.com");
	//getElement(password).sendKeys("test@123");
	
		 
	//5.By locator + generic function for element & action
	 //By emailId = By.id("input-email");	 
	 //By password = By.id("input-password");
	 
	 //doSendKeys(emailId,"input-email");
		 
		 
	//8. String locator +generic function for element & action in some util class
		String emailId =  "input-email";
		String passwordId =  "input-password";
		
		//By email = By.id("emailId");
		//By password = By.id("passwordId");
		
		doSendKeys("id" , emailId ,"naveen@gmail.com");
		doSendKeys("id", passwordId , "test@123");
		 
	
	
	
	}
	
	public static  By getBy(String locatorType, String selector)
	{
		By locator = null;
		switch (locatorType.toLowerCase()){
		case "id":
			locator = By.id(selector);
			break;
			
			
			default:
			break;
		}
		
		return locator;
	}

	public static void doSendKeys(String locatorType, String selector, String value) {
		By locator = getBy(locatorType, selector);
		getElement(locator).sendKeys(value);
	}

	
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
	
	

	


