package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-women-in-sri-lanka-2022-1319706/sri-lanka-women-vs-india-women-3rd-t20i-1319711/full-scorecard");
		 System.out.println(getWicketTakerName("Shafali Verma"));
		 System.out.println(getWicketTakerName("Sabbhineni Meghana"));
		 
		 System.out.println(getPlayerScoreCardList("Shafali Verma"));
		 System.out.println(getPlayerScoreCardList("Sabbhineni Meghana"));
		 
	
	}
	public static String getWicketTakerName(String playername) {
		String WicketTaker = driver.findElement(By.xpath("//span[text()='"+playername+"']/ancestor::td//following-sibling::td")).getText();
		return WicketTaker;
	}
	
	public static List <String> getPlayerScoreCardList(String playername) {
		List <WebElement> ScoreList = driver.findElements(By.xpath("//span[text()='Shafali Verma']/ancestor::td//following-sibling::td"));
		
			List <String> ScoreCardList = new ArrayList<String>();
				for(WebElement e: ScoreList) {
				String text = e.getText();
				ScoreCardList.add(text);
				
			}
		return ScoreCardList;
}}
