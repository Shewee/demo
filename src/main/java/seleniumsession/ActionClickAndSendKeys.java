package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickAndSendKeys {
	
    static WebDriver driver; 
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		doActionsClick(email, "test@gmail.com");
		doActionsClick(password, "test@123");
		doSendKeys(loginBtn);
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator , String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doSendKeys(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

}
