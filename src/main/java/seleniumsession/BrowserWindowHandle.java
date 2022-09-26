package seleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("img[alt='OrangeHRM on twitter']")).click();
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	
	String ParentWindowid = it.next();
	System.out.println("Parentwindowid:" +ParentWindowid);
	
	
	String ChildWindowId = it.next();
	System.out.println("ChildWindowId:" +ChildWindowId);

	
	
	driver.switchTo().window(ChildWindowId);
	System.out.println(driver.getCurrentUrl());
	driver.close();
	
	driver.switchTo().window(ParentWindowid);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.quit();
	}

}


