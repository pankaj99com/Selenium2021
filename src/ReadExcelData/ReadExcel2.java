package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
	
		File src=new File("C:\\Users\\pankaj.kumar\\workspace\\Selenium2021\\src\\ReadExcelData\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		
		
		String data1=sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Data from Excel "+data1);
		
		
		int data2=(int) sheet1.getRow(1).getCell(1).getNumericCellValue();
		System.out.println("Data from Excel "+data2);
		
		
		String data3=sheet1.getRow(1).getCell(2).getStringCellValue();
		System.out.println("Data from Excel "+data3);
		
		
		
		
		sheet1.getRow(2).createCell(3).setCellValue("Pass");
		
		FileOutputStream fout=new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();

	}

}
