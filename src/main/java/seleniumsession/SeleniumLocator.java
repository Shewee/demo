package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocator {
static WebDriver driver;

		public static void main(String[] args) {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			 
            //name-
			 //By emailID = By.name("email");
			//By passwordID = By.name("password");
			
			//String email_name ="email";
			//String password_name ="password";
			
			//ElementUtil eleUtil = new ElementUtil(driver);
			//eleUtil.doSendKeys(emailID, "test@gmail.com");
			//eleUtil.doSendKeys("name", "test123", password_name);
 
			//Xpath - is not an attribut.Its an address of  the element in HTML DOM
			//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
			//driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
			//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
			
			
			By emailId = By.xpath("//*[@id=\"input-email\"]");
			String password_xpath = "//*[@id=\"input-password\"]";
			By login_btn = By.xpath("//*[@id=\\\"content\\\"]/div/div[2]/div/form/input");
			
			ElementUtil eleUtil = new ElementUtil(driver);
			eleUtil.doSendKeys(emailId, "test@gmail.com");
			eleUtil.doSendKeys("xpath",password_xpath ,"test@123");
			//*[@id="input-email"]
			
			
			 doClick(login_btn);
	}
		
		public static void doClick(By locator) {
			getElement(locator).click();	
		}

	public static WebElement getElement(By locator) 
	{
		return driver.findElement(locator);
	}
		

}
