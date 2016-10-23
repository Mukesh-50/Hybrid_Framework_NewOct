package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.os.WindowsUtils;

public class TestDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "G:\\Selenium\\IE\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://learn-automation.com/");
		System.out.println(driver.getTitle());
		try 
		{
			WindowsUtils.killByName("iexplore.exe");
		} catch (Exception e) {
			
			System.out.println("IE Instance is already closed");
		}

	}

}
