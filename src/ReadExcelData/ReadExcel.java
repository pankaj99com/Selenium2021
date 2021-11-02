package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
	
		File src=new File("C:\\Users\\pankaj.kumar\\workspace\\Selenium2021\\src\\ReadExcelData\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("Total number of rows is :"+rowcount);
		
		for(int i=0;i<rowcount;i++) {
			
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test data from excel is:"+ i +data0);
		}

	}

}
