package SeleniumUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalanderUtility {
	static WebDriver driver;
	

	
public static String[] getMonthYear(String monthYearVal){
		
		return monthYearVal.split(" ");
	}
	public static void selectDate(String expectedDate,String expectedMonth,String expectedYear){
		
		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(monthYearVal);
		
		while (!(getMonthYear(monthYearVal)[0].equals(expectedMonth) && getMonthYear(monthYearVal)[1].equals(expectedYear))) {

			driver.findElement(By.xpath("//a[@title='Next']")).click();

			monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
			
			System.out.println(monthYearVal);
	}
		driver.findElement(By.xpath("//a[text()='" +expectedDate+"']")).click();
	}

	

}
