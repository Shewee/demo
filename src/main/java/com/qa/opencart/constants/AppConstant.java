package com.qa.opencart.constants;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class AppConstant {
	
	public static final int SMALL_DEFAULT_TIME_OUT = 5;
	public static final int MEDIUM_SMALL_DEFAULT_TIMEOUT = 10;
	public static final int LARGE_SMALL_DEFAULT_TIMEOUT = 20;
	
	public static final String LOGIN_PAGE_TITLE = "Account Login";
	public static final String LOGIN_PAGE_URL_FRACTION = "route=account/login";
	
	public static final String ACCOUNTS_PAGE_TITLE = "My Account";
	public static final String ACCOUNTS_PAGE_URL_FRACTION = "route=account/login";
	
	public static final List<String> EXPECTED_ACCOUNT_HEADER_LIST = Arrays.asList("My Account","My Orders","My Affiliate Account","Newsletter");
	

}
