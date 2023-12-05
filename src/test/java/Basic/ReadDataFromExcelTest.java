package Basic;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ReadDataFromExcelTest 
{
	public WebDriver driver;
	
	@Test
	public void vtigerCRMTest() throws IOException
	{
		FileInputStream fis=new FileInputStream("src\\test\\resources\\Vtiger.xlsx");				////To read data from external resources
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		Row rw1=sh.getRow(0);
		Cell c1=rw1.getCell(0);
		
		Row rw2=sh.getRow(0);
		Cell c2=rw2.getCell(1);
		
		Row rw3=sh.getRow(1);
		Cell c3=rw3.getCell(0);
		
		String data1=c1.getStringCellValue();
		System.out.println(data1);
		
		String data2=c2.getStringCellValue();
		System.out.println(data2);
		
		String data3=c3.getStringCellValue();
		System.out.println(data3);
				
	}
}

