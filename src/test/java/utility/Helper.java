package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Pages.BaseClass;

public class Helper 
{

	public static String captureScreenShot(WebDriver driver) 
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		
		String path=System.getProperty("user.dir")+"/Screenshots/"+BaseClass.getDate()+".png";
		
		try 
		{
			FileUtils.copyFile(src, new File(path));
		} 
		catch (IOException e) 
		{
			System.out.println("Exception while capturing screenshot");
			System.out.println("Full info about exception :"+e.getMessage());
		}
		catch (Exception e) 
		{
			System.out.println("Exception while capturing screenshot");
			System.out.println("Full info about exception :"+e.getMessage());
		}

		finally
		{
			
		}
		
		return path;
	}
	
}
