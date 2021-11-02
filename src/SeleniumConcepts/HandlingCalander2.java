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

public class HandlingCalander2 {
	static WebDriver driver;
	WebDriverWait wait;

	public static void main(String[] args) {
		driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		String monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthyearval);
		String month = monthyearval.split(" ")[0].trim();
		String year = monthyearval.split(" ")[1].trim();
		while (!(month.equals("October") && year.equals("1986"))) {
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthyearval);
			month = monthyearval.split(" ")[0].trim();
			year = monthyearval.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//a[text()='9']")).click();

	}
}