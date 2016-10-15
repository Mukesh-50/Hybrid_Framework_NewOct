package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage 
{

   WebDriver driver;
	
	public LogOutPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(xpath=".//*[@id='welcome']") WebElement adminName;
	
	@FindBy(xpath=".//*[@id='welcome-menu']/ul/li[2]/a") WebElement logoutlink;
	
	
	public void logout_from_application()
	{
	
		adminName.click();
		
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		logoutlink.click();
		
	}
	
}
