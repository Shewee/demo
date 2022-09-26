package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mac = driver.findElement(By.linkText("MacBook"));
		mac.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
