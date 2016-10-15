package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPrac {

	public static void main(String[] args) 
	{

	long time=System.currentTimeMillis();
		
	SimpleDateFormat userformat=new SimpleDateFormat("MMM-dd-yyyy-HH-mm-ss");
	
	Date date=new Date(time);
	
	String newDate=userformat.format(date);

    System.out.println(date);
    
    System.out.println(newDate);
	
	
	}

}
