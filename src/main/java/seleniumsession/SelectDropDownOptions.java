package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownOptions {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getdropDownCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	//public static geDropDownList(By locator) {
		//Select select = new Select(getElement(locator));
		//List<string> optionValueList = new ArrayList<string>();
	

}
