package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
private WebDriver driver;
public ElementUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	

public By getBy(String LocatorType , String selector) {
	By locator = null;
	
	switch (LocatorType.toLowerCase()) {
	case "id":
	locator = By.id(selector);
	break;
	case "name":
	locator = By.name(selector);
	break;
	}
	return locator;
	}

public void doSendKeys(String locatorType, String selector ,String  value) {
	By locator = getBy(locatorType, selector);
	getElement(locator).sendKeys(value);
}

	
public void doSendKeys(By locator , String value) {
		getElement(locator).sendKeys(value);
		}

public WebElement getElement(By locator){
		return driver.findElement(locator); 
	}

}
