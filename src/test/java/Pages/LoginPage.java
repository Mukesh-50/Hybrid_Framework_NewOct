package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;



public class LoginPage 
{

    WebDriver driver;
   
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@CacheLookup
	@FindBy(id="txtUsername") 
	WebElement uname;
	
	@FindBy(name="txtPassword")
	WebElement pass;
	
	@FindBy(xpath="//*[@value='LOGIN']") 
	WebElement loginButton;
	
	
	public void login_To_Application_As_Admin(String username,String password)
	{
		

		
		uname.sendKeys(username);
	
		pass.sendKeys(password);
		
		loginButton.click();
		
		System.out.println("Login completed");
		
	}
	
	
	
	public void typeUserName()
	{
		uname.sendKeys("Admin");
	}
	
	public void typePassword()
	{
		pass.sendKeys("admin");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
