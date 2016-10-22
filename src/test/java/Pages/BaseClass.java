package Pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import utility.Helper;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass
{

	public WebDriver driver;
	
	public ExtentReports report;
	
	public static ExtentTest  logger;
	
	
	@BeforeSuite
	public void setupReport()
	{
		System.out.println("=====Report Started");
		report=new ExtentReports(System.getProperty("user.dir")+"/Reports/"+getDate()+".html");
		
	}
	

	@Parameters("browserName")
	@BeforeClass
	public void setup(String browser) throws InterruptedException
	{
	    
		System.out.println("=====Browser is getting ready============");
		 
		if (browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			
		} else if (browser.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
  
        
		System.out.println("=====Browser and application is ready============");
	}
	
	@AfterMethod
	public void endTest(ITestResult result)
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			String path=Helper.captureScreenShot(driver);
			
			logger.log(LogStatus.FAIL, logger.addScreenCapture(path));
		}
		
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			
			String path=Helper.captureScreenShot(driver);
			
			logger.log(LogStatus.PASS, logger.addScreenCapture(path));
		}
		
		report.endTest(logger);
		
		System.out.println("===== Report for test is generated");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		System.out.println("===== Browser and application is down");
	}
	
	@AfterSuite
	public void endReport()
	{
		report.flush();
		System.out.println("===== Extent report is generated>>> Kindly check report folder");
	}
	
	public static String getDate()
	{
		long time=System.currentTimeMillis();
		
		SimpleDateFormat userformat=new SimpleDateFormat("MMM-dd-yyyy-HH-mm-ss");
		
		Date date=new Date(time);
		
		String newDate=userformat.format(date);

	    return newDate;
		
	}
	

}
