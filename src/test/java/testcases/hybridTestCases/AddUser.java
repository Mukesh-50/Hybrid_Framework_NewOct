package testcases.hybridTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.AdminUserManagement;
import Pages.BaseClass;
import Pages.LoginPage;

public class AddUser extends BaseClass {

	@Test
	public void addUserToApplication() 
	{
		driver.get("http://enterprise.demo.orangehrmlive.com/symfony/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.typeUserName();

		login.typePassword();

		login.clickOnLoginButton();

		AdminUserManagement admin = PageFactory.initElements(driver,
				AdminUserManagement.class);

		admin.clickOnAdminLink();

		admin.verifyAdminPanel();

		admin.clickonAddUser();

		admin.typeEmpName();

		admin.typeUserName();

		admin.typePassword();

		admin.typeConfirmPassword();

		admin.clickOnSaveButton();

	}

}
