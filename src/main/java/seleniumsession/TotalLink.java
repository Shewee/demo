package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLink {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		
		List<WebElement> linkslist  = driver.findElements(By.tagName("a"));
		System.out.println("total links" +linkslist.size());
		
		for(int i=0; i<linkslist.size(); i++) {
			String text = linkslist.get(i).getText();
			System.out.println(text);
			
			
			if(!text.isEmpty()) {
			System.out.println(text);
		}
		}
		}
	
	  
	
	
	     //public static getElementTextCount(By locator) {
	    //	 //getElementTextCount()
	  //   }
	 //Non blank text list
	     public static List<String> getElementTextList(By locator) {
	    	List<WebElement> eleList =  getElements(locator);
	    	List<String> eleTextList = new ArrayList<String>();
	    	for(WebElement e : eleList) {
	    		String text = e.getText();
	    		if(!text.isEmpty()) {
	    			eleTextList.add(text);
	    			
	    		}
	    	}
	    	return eleTextList;
	     }
	
	
	
	   //This method will give total number of link on the page
	       public static int getPageElementcounts(By locator) {
	    	return getElements(locator).size();
	        }
	       
	       public static List<WebElement> getElements(By locator) {
		    return driver.findElements(locator);
	        }
	}

	

