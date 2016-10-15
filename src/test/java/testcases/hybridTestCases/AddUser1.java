package testcases.hybridTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dataProvider.DataProvider;
import Pages.AdminUserManagement;
import Pages.BaseClass;
import Pages.LogOutPage;
import Pages.LoginPage;

public class AddUser1 extends BaseClass {

	@Test(priority=1, description="This test will perform login", groups="")
	public void addUserToApplication() 
	{
	    String url=DataProvider.getConfig().getSitURL();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		String uname=DataProvider.getExcel().readStringData("Login", 0, 0);
		
		String pass=DataProvider.getExcel().readStringData("Login", 0, 1);
		
		login.login_To_Application_As_Admin(uname,pass);

		AdminUserManagement admin = PageFactory.initElements(driver,
				AdminUserManagement.class);
		

		admin.add_User_To_Applictaion("Alice Duval", "SeleniumWb", "aaa", "aaa");
		
		LogOutPage logout=PageFactory.initElements(driver, LogOutPage.class);
		
		logout.logout_from_application();

	}

}
