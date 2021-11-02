package com.DataDriven.test;

import SeleniumUtility.ExcelUtils;

public class ExcelUtilityTest {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		
		ExcelUtils excel=new ExcelUtils(projectPath+"\\src\\com\\DataDriven\\test\\TestData.xlsx","sheet1");
		ExcelUtils.getRowCount();
		ExcelUtils.getCellDataNumber(2, 1);//1st row --ist col
		ExcelUtils.getCellDataString(2, 0);//row
		

	}

}
