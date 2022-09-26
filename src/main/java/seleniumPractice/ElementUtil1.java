package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementUtil1 {

	public static void main(String[] args) {
		
		
		//public static WebElement getElement(By locator) {
			//return driver.findElement(locator);
		}
		//public static void doSendKeys(By locator , String Value) {
		//	getElement(locator).sendKeys(Value);
		//}
		
		public  void doSendKeys(String locatorType, String value ,String selector) {
//			By locator = getBy(locatorType, selector);
		//	getElement(locator).sendKeys(value);
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


