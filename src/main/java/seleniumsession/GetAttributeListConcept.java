package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeListConcept {
	
	static WebDriver driver;

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//total link on the page and return href list
		
		//List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		//for(WebElement e : linkslist) {
			//String hrefVal = e.getAttribute("href");
			//System.out.print("hrefVal");
			
		//}}
		
		By links = By.tagName("a");
		By imag = By.tagName("img");
		System.out.println(getEleAttributeList(links,"href"));
		System.out.println(getEleAttributeList(imag,"alt"));
		
	}
		public static List<String> getEleAttributeList(By locator, String attrname) {
			List<WebElement> eleList = getElements(locator);
			List<String> eleAttrValList = new ArrayList<String>();
			for(WebElement e : eleList) {
				String attrValue = e.getAttribute(attrname);
				eleAttrValList.add(attrValue);
			}
			return eleAttrValList;
		}
		
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		
		

	}
