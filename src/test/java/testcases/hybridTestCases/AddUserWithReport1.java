package testcases.hybridTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utility.Helper;

import com.relevantcodes.extentreports.LogStatus;

import Pages.AdminUserManagement;
import Pages.BaseClass;
import Pages.LogOutPage;
import Pages.LoginPage;

// This TC will perform login operation and it will generate Extent report


public class AddUserWithReport1 extends BaseClass {

	@Test
	public void addUserToApplication() 
	{
		
		BaseClass.logger=report.startTest("Login with valid User");
		
		driver.get("http://enterprise.demo.orangehrmlive.com/symfony/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		logger.log(LogStatus.INFO, "Login Sectio started");
		
		login.typeUserName();

		login.typePassword();

		logger.log(LogStatus.INFO, logger.addScreenCapture(Helper.captureScreenShot(driver)));
		
		login.clickOnLoginButton();
		
		logger.log(LogStatus.INFO, "Login  Completed");

		AdminUserManagement admin = PageFactory.initElements(driver,
				AdminUserManagement.class);

		logger.log(LogStatus.INFO, logger.addScreenCapture(Helper.captureScreenShot(driver)));
		
		admin.clickOnAdminLink();

		admin.verifyAdminPanel();

		admin.clickonAddUser();

		admin.typeEmpName();

		admin.typeUserName();

		admin.typePassword();

		admin.typeConfirmPassword();

		admin.clickOnSaveButton();
		
		logger.log(LogStatus.PASS, "User Created ");

	}
	
	@Test
	public void searchUser()
	{
		
	  BaseClass.logger=report.startTest("Logout From Current Session");	
		
	  LogOutPage logout=PageFactory.initElements(driver, LogOutPage.class);
		
	  logger.log(LogStatus.INFO, "Logout button clicked");
	  
	  logout.logout_from_application();
	  
	  logger.log(LogStatus.PASS, "Logout successfully");
	  
	  
	}
	
	
}
