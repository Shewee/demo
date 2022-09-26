package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectWithSelectClassonly {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//By country = By.id("Form_submitForm_Country");
		//By countryoptions = By.xpath("//select[@id='Form_submitForm_Country']");

	}
    
}
