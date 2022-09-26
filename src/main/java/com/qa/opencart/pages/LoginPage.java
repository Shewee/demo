package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import com.qa.opencart.constants.AppConstant;
import com.qa.opencart.utils.ElementUtil;

//import seleniumsession.ElementUtil;

public class LoginPage {
private WebDriver driver;
private ElementUtil eleUtil;


//1.By Locator =OR
private By emailid =By.id("input-email");
private By pw = By.id("input-password");
private By loginbtn = By.xpath("//input[@value='Login']");
private By forgotPWLink = By.linkText("Forgotten Password");
private By registerLink = By.linkText("Register");

//2.PageConst
public  LoginPage(WebDriver driver) {
this.driver = driver;
eleUtil= new ElementUtil(driver);
}

//3.PageAction
public String getLoginPageTitle() {
String title =	eleUtil.waitForTitleToBe(AppConstant.LOGIN_PAGE_TITLE ,AppConstant.SMALL_DEFAULT_TIME_OUT);
System.out.println("Page title is " +title);
return title;
}

//4.PageUrl

public String getPageUrl() {
	String url = eleUtil.waitForUrl(AppConstant.SMALL_DEFAULT_TIME_OUT, AppConstant.LOGIN_PAGE_URL_FRACTION);
	System.out.println("Page current url is" +url);
	return url;
}

public boolean isForgotPwLinkExit() {
	return eleUtil.waitForElementPresence(forgotPWLink, AppConstant.SMALL_DEFAULT_TIME_OUT).isDisplayed();
}

public AccountsPage doLogin(String username , String pwd) {
	System.out.println("apps creds" +username+ ":" +pwd);
	eleUtil.doSendKeysWithWait(emailid, AppConstant.MEDIUM_SMALL_DEFAULT_TIMEOUT, username);
	eleUtil.doSendKeys(pw, pwd);
	eleUtil.doClick(loginbtn);
	//return eleUtil.waitForTitleToBe(AppConstant.ACCOUNTS_PAGE_TITLE, AppConstant.SMALL_DEFAULT_TIME_OUT);
	/*
	 * MethodChaining concept,Its loginpage method responsibility to give object of next landing page i.e AccountPage.
	 */
	return new AccountsPage(driver);
	
	
}
 public SearchResultPage performSearch(String name) {
	 AccountsPage accPage = new AccountsPage(driver);
	 return accPage.doSearch(name);
 }
 public RegisterPage goToRegisterPage() {
	 eleUtil.doClick(registerLink);
	 return new RegisterPage(driver);
 }


}
