package SeleniumUtility;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {

		try {

			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception exp) {
			System.out.println(exp.getLocalizedMessage());
			exp.printStackTrace();
			exp.getCause();
		}

	}

	public static void main(String[] args) {
		// ExcelUtils.getRowCount();
		// ExcelUtils.getCellDataNumber(0,2);
		ExcelUtils.getCellDataString(3, 3);

	}

	public static void getRowCount() {
		try {

			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowcount);
		} catch (Exception exp) {
			System.out.println(exp.getLocalizedMessage());
			exp.printStackTrace();
			exp.getCause();

		}
	}

	public static void getCellDataString(int rowNum, int colNum) {

		try {

			String celldataString = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(celldataString);
		} catch (Exception exp) {
			System.out.println(exp.getLocalizedMessage());
			exp.printStackTrace();
			exp.getCause();

		}

	}

	public static void getCellDataNumber(int rowNum, int colNum) {

		try {

			double celldatanumber = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldatanumber);
		} catch (Exception exp) {
			System.out.println(exp.getLocalizedMessage());
			exp.printStackTrace();
			exp.getCause();

		}

	}

}
