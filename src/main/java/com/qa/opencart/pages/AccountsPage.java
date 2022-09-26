package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstant;
import com.qa.opencart.utils.ElementUtil;

public class AccountsPage {
	
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//1.ByLocator
	private By logoutLink = By.linkText("Logout");
	private By searchField = By.name("search");
	private By searchIcon = By.cssSelector("div#search button");
	private By accPageHeaders = By.cssSelector("div#content h2");
	
	//2.Const....
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
		
	}
	
	//3.Page Action
	public String getAccountsPageTitle() {
		String title =	eleUtil.waitForTitleToBe(AppConstant.ACCOUNTS_PAGE_TITLE ,AppConstant.SMALL_DEFAULT_TIME_OUT);
		System.out.println("Acc title is " +title);
		return title;
		}

		//4.PageUrl

		public String getAccountPageUrl() {
			String url = eleUtil.waitForUrl(AppConstant.SMALL_DEFAULT_TIME_OUT, AppConstant.ACCOUNTS_PAGE_URL_FRACTION);
			System.out.println("Acc Page current url is" +url);
			return url;
		}
	
       public boolean isLogoutLinkExist() {
    	  return eleUtil.waitForElementPresence(logoutLink, AppConstant.MEDIUM_SMALL_DEFAULT_TIMEOUT).isDisplayed();
       }
       public boolean isSearchFieldExist() {
     	  return eleUtil.waitForElementPresence(searchField, AppConstant.MEDIUM_SMALL_DEFAULT_TIMEOUT).isDisplayed();
       }
     	
       public List<String>  getAccountSectionHeaderList(){
     		return eleUtil.getAllElementsTextList(accPageHeaders, AppConstant.SMALL_DEFAULT_TIME_OUT);
     	}
       
       //CommonPageAction
       public SearchResultPage doSearch(String productName) {
    	   System.out.println("searching for " +productName);
    	   eleUtil.doSendKeysWithWait(searchField, 10, productName);
    	   eleUtil.doClick(searchIcon);
    	   return new SearchResultPage(driver);
    	   
       }
       
}
