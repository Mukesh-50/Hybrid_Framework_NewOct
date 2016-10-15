package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {

	XSSFWorkbook wb;

	public ExcelConfig() throws Exception 
	{
		
		System.out.println("========= Excel file is loading=================");
		
	    String location=System.getProperty("user.dir");
		
		// excel located
		File src = new File(location+"\\TestData\\AppData.xlsx");

		// convert data in binary/byte format
		FileInputStream fis = new FileInputStream(src);

		// XSSFWorkbook- This will be used .xlsx and HSSFWorkBook- .xls

		// Load the complete excel sheet
		wb = new XSSFWorkbook(fis);

		System.out
				.println("=============== Excel file is loaded and Ready to use=========================");
	}
	
	
	public String readStringData(String sheetName,int rowIndex,int columnIndex)
	{
		String data=wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		
		return data;
	}
	
	public int  readNumericData(String sheetName,int rowIndex,int columnIndex)
	{
		int  data=(int)wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getNumericCellValue();
		
		return data;
	}
	
	
	public int getRows(String sheetName)
	{ 
	 int row=wb.getSheet(sheetName).getPhysicalNumberOfRows();
	 
	 return row;
	}
	
	public int getRows(String sheetName,int row)
	{ 
	 int col=wb.getSheet(sheetName).getRow(row).getPhysicalNumberOfCells();
	 
	 return col;
	}
	

}
