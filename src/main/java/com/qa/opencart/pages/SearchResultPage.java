package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstant;
import com.qa.opencart.utils.ElementUtil;

public class SearchResultPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//1.ByLocator
	By productCount = By.cssSelector("div.product-thumb");
	
	
	//2.Const....
	public SearchResultPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
		
	}
	//3.PageAction
	public int getSearchProductCount() {
		return eleUtil.waitForElementsToBeVisible(productCount, AppConstant.MEDIUM_SMALL_DEFAULT_TIMEOUT).size();
	}
	
	public productInfoPage selectProduct(String searchProductName) {
		By product = By.linkText(searchProductName);
		eleUtil.doClick(product);
		return new productInfoPage(driver);
	}
	
	public String getProductHeaderValue(String mainProductName) {
		By mainProduct = By.xpath("//h2[text()='"+mainProductName+"']");
		return eleUtil.doElementGetText(mainProduct);
	}

}
