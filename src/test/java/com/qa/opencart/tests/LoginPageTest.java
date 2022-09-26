package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstant;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void loginPageTitleTest() {
		String actTitle = loginpage.getLoginPageTitle();
		Assert.assertEquals(actTitle, AppConstant.LOGIN_PAGE_TITLE);
	}
	
	@Test
	public void loginPageUrlTest() {
		String actUrl = loginpage.getPageUrl();
		Assert.assertEquals(actUrl.contains(AppConstant.LOGIN_PAGE_URL_FRACTION), true);
	}
	
	@Test
	public void forgotPwLinkExistTest() {
		Assert.assertEquals(loginpage.isForgotPwLinkExit(), true);
	}
	
	@Test
	public void loginTest() {
		accpage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(accpage.getAccountsPageTitle(), AppConstant.ACCOUNTS_PAGE_TITLE);
	}
}
