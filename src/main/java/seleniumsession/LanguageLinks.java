package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//String text = driver.findElement(By.xpath("//div[@id='SIvCob']")).getText();
		//System.out.println(text);
		
		List<WebElement> langlink = driver.findElements(By.xpath("//div[@id='SIvCob']"));
		System.out.println(langlink.size());
		
		for(WebElement e :langlink) {
			String  text = e.getText();
			System.out.println(text);
			if(text.contains("हिन्दी")) {
				e.click();
				break;
			}
		}
	}

}
