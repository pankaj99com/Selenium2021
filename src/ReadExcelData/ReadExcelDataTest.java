package ReadExcelData;

public class ReadExcelDataTest {

	public static void main(String[] args) {
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\pankaj.kumar\\workspace\\Selenium2021\\src\\ReadExcelData\\TestData.xlsx");
		System.out.println(excel.getData(0,2,0));

	}

}
