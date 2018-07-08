package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void readexcel() throws Exception {
		File src=new File("C:\\Selenium\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int First = sheet.getFirstRowNum();
		int Last = sheet.getLastRowNum();
		for(int i=First+1;i<=Last;i++)
		{
			Row row=sheet.getRow(i);
//			System.out.println(row.getCell(i).getStringCellValue());
//			System.out.println("success");
			for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++)
			{
				Cell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
			System.out.println("---------------");
			
		}
		wb.close();
		
		 
//		String data0 = sheet.getRow(1).getCell(1).getStringCellValue();
		
	}

}
