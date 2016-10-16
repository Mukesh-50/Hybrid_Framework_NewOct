package testcases.hybridTestCases;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTestCase 
{
	
	@Test
	public void testApplication() throws MalformedURLException
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setBrowserName(BrowserType.CHROME);
		
		cap.setPlatform(Platform.WIN8_1);
		
		URL url=new URL("http://localhost:4444/wd/hub");
		
		WebDriver driver= new RemoteWebDriver(url, cap);
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Gecko Driver");
		
	}

}
