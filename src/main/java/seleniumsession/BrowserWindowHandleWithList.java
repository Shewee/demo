package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWithList {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("img[alt='OrangeHRM on twitter']")).click();
		List<String> handlesList = new ArrayList<String>();
		String PaarentWindowId = handlesList.get(0);
		String ChildWindowId = handlesList.get(1);
		

		driver.switchTo().window(ChildWindowId);
		System.out.println("ChildWindow url" +driver.getTitle());
		driver.close();
		
		driver.switchTo().window(PaarentWindowId);
		System.out.println("Parent window url " +driver.getTitle());
		System.out.println("Child window url" +driver.getCurrentUrl());
		driver.quit();

	}

}
