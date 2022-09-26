package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeMethod {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	    //String placeholderVal = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
	    //System.out.println(placeholderVal);
		
	    //String hrefVal = driver.findElement(By.linkText("Login")).getAttribute("href");
	    //System.out.println(hrefVal);
	    
	    By fn = By.id("input-firstname");
	    By login = By.linkText("Login");
	    String placeholderVal = dogetAttribute(fn, "placeholder");
	   String loginUrl = dogetAttribute(login, "href");

		System.out.println(placeholderVal);
		System.out.println(loginUrl);

	}
	public static String dogetAttribute(By locator,String attrname) {
		return getElement(locator).getAttribute(attrname);
	}

	
	
      public static WebElement getElement(By locator) {
      return driver.findElement(locator);
      }
}
