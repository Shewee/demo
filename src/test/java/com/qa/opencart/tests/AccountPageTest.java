package com.qa.opencart.tests;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstant;
//import com.qa.opencart.pages.LoginPage;

public class AccountPageTest extends BaseTest {
	
	@BeforeClass
	public void accSetup() {
		accpage = loginpage.doLogin(prop.getProperty("username") , prop.getProperty("password"));
		
	}
	@Test
	public void isLogoutLinkExistTest() {
		Assert.assertEquals(accpage.isLogoutLinkExist(), true);
	}
		
	@Test
	public void accPageTitleTest() {
		Assert.assertEquals(accpage.getAccountsPageTitle(), AppConstant.ACCOUNTS_PAGE_TITLE);
	}
	
	@Test
	public void accPageHeaderTest() {
	List<String> actsecHeaderList =	accpage.getAccountSectionHeaderList();
	System.out.println("==========account header=======" +actsecHeaderList);
	Assert.assertEquals(actsecHeaderList, AppConstant.EXPECTED_ACCOUNT_HEADER_LIST);
		
	}
	

}
