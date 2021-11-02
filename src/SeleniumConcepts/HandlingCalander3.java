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

public class HandlingCalander3 {
	static WebDriver driver;
	WebDriverWait wait;

	public static void main(String[] args) {
		driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		calender("June", "2020", "32");

	}
	
	
	public static String[] getmonthyear(String monthyear) {
		return monthyear.split(" ");
		
	}
	public static void calender(String monthval,String yearval,String dateval) {
		
		if(monthval.equals("Feburary") && Integer.parseInt(dateval)>29 ) {
			
			System.out.println("Invalid date entered"+monthval+ "and"+ dateval);
						
		}else if(Integer.parseInt(dateval)>31){
			
			System.out.println(monthval+"  cannot have "+dateval+ " days");
			
		}else {
		
		String monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthyearval);
		
		while (!(getmonthyear(monthyearval)[0].equals(monthval) && getmonthyear(monthyearval)[1].equals(yearval))) {
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthyearval);
			
		}
		try {
			driver.findElement(By.xpath("//a[text()='"+dateval+"']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("WRONG DATE ENETERED:"+monthval+" : "+dateval);
		}
	}
}
}