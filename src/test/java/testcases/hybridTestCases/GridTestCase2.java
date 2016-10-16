package testcases.hybridTestCases;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTestCase2 
{
	  public static final String USERNAME = "mukeshotwani1";
	  public static final String AUTOMATE_KEY = "C5cfhyWjq4pfsH1PXigz";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void testApplication() throws MalformedURLException
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setBrowserName(BrowserType.IPHONE);
	
		
		cap.setCapability("browserstack.debug", "true");
	
		
		cap.setPlatform(Platform.MAC);
		
		URL url=new URL(URL);
		
		WebDriver driver= new RemoteWebDriver(url, cap);
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Gecko Driver");
		
		driver.quit();
	}

}
