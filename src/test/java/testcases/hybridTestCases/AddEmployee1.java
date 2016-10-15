package testcases.hybridTestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AddEmployee1 {

	@Test
	public void generateReport() {

		ExtentReports report = new ExtentReports(System.getProperty("user.dir")
				+ "/Reports/Selenium2.html");
		
		ExtentTest logger=report.startTest("Creating Employee", "This test will add emp in portfolio");

		logger.log(LogStatus.INFO, "Browser started");
		
		logger.log(LogStatus.INFO, "App started");
		
		logger.log(LogStatus.INFO, "Username");
		
		logger.log(LogStatus.INFO, "Password ");
		
		logger.log(LogStatus.PASS, "User created Successfully");
		
	    String img=logger.addScreenCapture("C:\\Users\\Mukesh_50\\Desktop\\Blind-Men-And-The-Elephant.gif");
		
	    logger.log(LogStatus.PASS, img);
	    
		report.endTest(logger);
		
		ExtentTest logger1=report.startTest("Deleting Employee", "This will delete the emp details");
		
		logger1.log(LogStatus.INFO, "User Selected");
		
		logger1.log(LogStatus.FAIL, "User Deleted");
		
		report.endTest(logger1);
	
		report.flush();
		
	}

}
