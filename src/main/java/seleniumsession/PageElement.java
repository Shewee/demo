package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageElement {
	
    static WebDriver driver;
    public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//List<WebElement> Leftlink = driver.findElements(By.xpath("//aside[@id='column-right']//a"));
		//System.out.println(Leftlink.size());
		
		//List<WebElement> searchlist = driver.findElements(By.name("search"));
		//if(searchlist.size()==1){
			//System.out.println("search is displayed");}
		
		//boolean flag = driver.findElement(By.name("search")).isDisplayed();
		//System.out.println(flag);
		//if(flag) {
			//System.out.println("search is present on the page");
		//}
		
		//}
		
		By search = By.name("Search");
		if(checkSingleElementExist(search)) {
			System.out.println("search exist only one time on  the page");
		}
		By forgotpassword = By.linkText("Forgotten Password");
		{
			if(checkMultipleElementExist(forgotpassword)) {
				System.out.println("forgot pw is having multiple displayed");
				if(getCount(forgotpassword) == 2) {
					System.out.println("forgot pw is having 2times displayed");
				}
			}
		}
		}
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		public static boolean doIsBoolean(By locator) {
			return driver.findElement(locator).isDisplayed();
		}
		public static int getCount(By locator) {
			return driver.findElements(locator).size();
		}
		public static boolean checkSingleElementExist(By locator) {
			if(getCount(locator) == 1) {
			 return true;
			}
			return false;
		}
		public static boolean checkMultipleElementExist(By locator) {
			if(getCount(locator) >1 ) {
				return true;
			}
			return false;
		}

	}


