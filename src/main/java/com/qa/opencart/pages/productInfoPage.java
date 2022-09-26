package com.qa.opencart.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.constants.AppConstant;
import com.qa.opencart.utils.ElementUtil;

public class productInfoPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//1.ByLocator
	private By productHeader = By.cssSelector("div#content h1");
	private By productImages = By.cssSelector("ul.thumbnails img");
	private By productMetaData = By.xpath("(//div[@id='content']//ul[@class='list-unstyled'])[1]//li");
	private By productPriceData = By.xpath("(//div[@id='content']//ul[@class='list-unstyled'])[2]//li");
	
	private Map <String , String > productMap;
	
	//2.Const....
	public productInfoPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
		
	}

	public String getProductHeaderValue() {
		// TODO Auto-generated method stub
	String productHeaderVal = eleUtil.doElementGetText(productHeader);
	System.out.println("productHeader" +productHeaderVal);
	return productHeaderVal;
	}
	
	public int getProductImagesCount() {
		int imagescount = eleUtil.waitForElementsToBeVisible(productImages, AppConstant.MEDIUM_SMALL_DEFAULT_TIMEOUT).size();
		System.out.println("Images count:" +imagescount);
		return imagescount;
	}
	public void getProductInfo() {
		productMap = new HashMap<String,String>();
		 List<WebElement> metaDataList = eleUtil.getElements(productMetaData);
		 //ProductMetaData
		 
		 //Brand: Apple
		 //Product Code: Product 17
		 //Reward Points: 700
		 //Availability: In Stock
		 for(WebElement e : metaDataList) {
			 String text= e.getText();
			 String meta[] = text.split(":");
			 String key =  meta[0].trim();
			 String value =  meta[1].trim();
			 productMap.put(key, value);
		 }
		
		
		
		
		
	}
}
