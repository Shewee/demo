package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {

	
	//Launch ChromeBrowser
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		//WebDriver driver2 = new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
