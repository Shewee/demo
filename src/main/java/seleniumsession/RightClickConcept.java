package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
	Actions act = new Actions(driver);
	act.contextClick(rightClick).perform();
	Thread.sleep(2000);
	
	
	List<WebElement> rightClickList = driver.findElements(By.xpath("//li[contains(@class,'context-menu-icon')]/span"));	
    System.out.println(rightClickList.size());
    
    for(WebElement e : rightClickList) {
    String text =	e.getText();
    System.out.println("text");
    if(text.equals("Copy"));
    e.click();
    break;
    }
	}

}
