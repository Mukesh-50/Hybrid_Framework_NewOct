package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelConfig;
import Pages.BaseClass;

public class FirstDDT extends BaseClass {

	@Test(dataProvider = "CRMAppData")
	
	public void loginDiffUser(String username, String password)throws Throwable
	{
		System.out.println("===========Test started===========");

		driver.get("https://enterprise-demo.orangehrmlive.com/symfony/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);

		driver.findElement(By.id("txtPassword")).sendKeys(password);

		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.id("welcome")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		System.out.println("===========Test END============");
	}

	
	@DataProvider(name = "CRMAppData")
	public Object[][] getDataApp() throws Exception {

		System.out.println("=====Test Data is getting ready============");

		
		ExcelConfig config=new ExcelConfig();
		
		int row=config.getRows("Login");
		
		
		Object[][] logins = new Object[row][2];

		
		for(int i=0;i<=row-1;i++)
		{
			
			logins[i][0]=config.readStringData("Login", i, 0);
			logins[i][1]=config.readStringData("Login", i, 1);
		}
		

		System.out.println("=====Test Data is ready============");

		return logins;
	}

}
