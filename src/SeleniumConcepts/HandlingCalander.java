package SeleniumConcepts;

import java.time.Clock;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCalander {
	static WebDriver driver;
	WebDriverWait wait;

	public static void main(String[] args) {
		driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		new WebDriverWait(driver, 5);
		// new WebDriverWait(driver,Duration.ofMinutes(5));

//		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
//		System.out.println(monthYearVal);
//		String month = monthYearVal.split(" ")[0].trim();
//		String year = monthYearVal.split(" ")[1].trim();
//
//		System.out.println(month);
//		System.out.println(year);
//
//		while (!(month.equals("October") && year.equals("1986"))) {
//
//			driver.findElement(By.xpath("//a[@title='Prev']")).click();
//
//			monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
//			System.out.println(monthYearVal);
//			month = monthYearVal.split(" ")[0].trim();
//			year = monthYearVal.split(" ")[1].trim();
//		}
//		driver.findElement(By.xpath("//a[text()='9']")).click();
//	}

		selectDate("32","April","2022");
	}
	public static String[] getMonthYear(String monthYearVal){
		
		return monthYearVal.split(" ");
	}
	public static void selectDate(String expectedDate,String expectedMonth,String expectedYear){
		
		if(expectedMonth.equals("Feburary")&& Integer.parseInt(expectedDate)>29 ){
			System.out.println("wrong date:  "+expectedMonth + ":"+	expectedYear);
			return;
		}
		if(Integer.parseInt(expectedDate)>31){
			System.out.println("Wrong date :"+expectedMonth+" "+expectedDate);
			return;
		}
		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(monthYearVal);
		
		while (!(getMonthYear(monthYearVal)[0].equals(expectedMonth) && getMonthYear(monthYearVal)[1].equals(expectedYear))) {

			driver.findElement(By.xpath("//a[@title='Next']")).click();

			monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
			
			System.out.println(monthYearVal);
	}
		WebElement date=driver.findElement(By.xpath("//a[text()='" +expectedDate+"']"));
		date.click();
		System.out.println(date.getText());
		System.out.println(date.getText()+" "+monthYearVal);
	}

}


