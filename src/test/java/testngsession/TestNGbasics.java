package testngsession;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS-connectWithDB");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT-createUser");
	}
	
	@BeforeClass
	public void launchbrowser() {
		System.out.println("BC-launchBrowser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM-login");
	}
	
	@Test
	public void addToCartTest() {
		System.out.println("add to cart test");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("AM-logout");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- delete user");
	}

	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnectWithDB");
	}

}

