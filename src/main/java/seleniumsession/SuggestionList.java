package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionList {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//li[text()='T-shirts > Faded Short Sleeve T-shirts']")).click();
		selectItem("T-shirts > Faded Short Sleeve T-shirts");

	}
	
	public static void selectItem(String productName) {
	driver.findElement(By.xpath("//li[text()='"+productName+"']")).click();
		////li[text()='T-shirts > Faded Short Sleeve T-shirts']
	}

}
////*[@id="search"]/div[2]/ul/li[6]