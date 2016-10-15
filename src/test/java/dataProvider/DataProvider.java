package dataProvider;

import utility.ConfigReader;
import utility.ExcelConfig;

public class DataProvider 
{

	
	public static ExcelConfig getExcel()
	{
		
		ExcelConfig config = null;
		try 
		{
			config = new ExcelConfig();
		} catch (Exception e) 
		{
			
		}
		
		return config;
	}
	
	public static ConfigReader getConfig()
	{
		
		ConfigReader reader=new ConfigReader();
		
		return reader;
	}
	
}
