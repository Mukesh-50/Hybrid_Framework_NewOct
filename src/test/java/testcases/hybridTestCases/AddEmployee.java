package testcases.hybridTestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AddEmployee {

	@Test
	public void generateReport() {

		ExtentReports report = new ExtentReports(System.getProperty("user.dir")
				+ "/Reports/Selenium.html");
		
		ExtentTest logger=report.startTest("Creating Employee", "This test will add emp in portfolio");

		logger.log(LogStatus.INFO, "Browser started");
		
		logger.log(LogStatus.INFO, "App started");
		
		logger.log(LogStatus.INFO, "Username");
		
		logger.log(LogStatus.INFO, "Password ");
		
		logger.log(LogStatus.PASS, "User created Successfully");
		
		report.endTest(logger);
		
		report.flush();
		
	}

}
