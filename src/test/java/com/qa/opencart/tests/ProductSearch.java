package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class ProductSearch extends BaseTest {
	@BeforeClass
	public void productSearchSetup() {
		accpage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void productSearchTest() {
		searchResPage = accpage.doSearch("MacBook");
		productInfoPage = searchResPage.selectProduct("MacBook Air");
		String actProductHeaderName = productInfoPage.getProductHeaderValue();
		Assert.assertEquals(actProductHeaderName, "MacBook Air");
	}
	@Test
	public void getProductImagesCountTest() {
		searchResPage = accpage.doSearch("MacBook");
		productInfoPage = searchResPage.selectProduct("MacBook Pro");
		String actImagesCount = productInfoPage.getProductHeaderValue();
		Assert.assertEquals(actImagesCount, 4);

}
}