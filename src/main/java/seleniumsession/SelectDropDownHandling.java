package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		
		By Country = By.id("Form_submitForm_Country");
		By state =   By.id("Form_submitForm_State");
		
		doSelectByVisibleText(Country , "India");
		Thread.sleep(3000);
		doSelectByVisibleText(state , "Haryana");
		
		
		

	}
	
	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectByValue(By locator , String value) {
		Select select = new Select(getElement(locator));
		select.deselectByValue(value);
	}
	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.deselectByVisibleText(text);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}


//Exception-UnsupportedOperationException