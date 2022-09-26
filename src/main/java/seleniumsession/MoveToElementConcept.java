package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		By Parentmenu = By.className("menulink");
		By courses = By.linkText("COURSES");
		handleTwoLevelMenuItem(Parentmenu ,courses);

	}
	
	public static void handleTwoLevelMenuItem(By Parentmenu ,By courses) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(Parentmenu)).perform();
		Thread.sleep(3000);
		getElement(courses).click();
	}
	
	public static WebElement getElement(By locator) {
	return driver.findElement(locator);

}}
