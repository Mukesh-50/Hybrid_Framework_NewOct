package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.AdminUserManagement;
import Pages.LoginPage;

public class FirstTCUsingPageObject 
{

	@Test
	public void loginToApplication()
	{
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://enterprise-demo.orangehrmlive.com/symfony/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    LoginPage login=PageFactory.initElements(driver, LoginPage.class);
	    
	    login.typeUserName();
	    
	    login.typePassword();
	    
	    login.clickOnLoginButton();
	    
	    
	     AdminUserManagement admin=PageFactory.initElements(driver, AdminUserManagement.class); 
	     
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
