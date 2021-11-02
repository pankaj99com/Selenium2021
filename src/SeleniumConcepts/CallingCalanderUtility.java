package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumUtility.CalanderUtility;

public class CallingCalanderUtility {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		new WebDriverWait(driver, 5);
		CalanderUtility.selectDate("10","October","2020");
	}

}
