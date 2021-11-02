package SeleniumConcepts;

import java.time.Year;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejetcalender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.goindigo.in/");
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-acc-cookie']")).click();
		driver.findElement(By.xpath("((//input[@placeholder='Departure Date' and @name='or-depart'])[1]")).click();
		WebElement date=driver.findElement(By.xpath("(//input[@placeholder='Departure Date' and @name='or-depart'])[1]"));
		
		System.out.println(date);
		String datevalue="25 Oct 2021";
		
		Selectdate(driver, date, datevalue);
		
		
	}
	
	public static void Selectdate(WebDriver driver,WebElement element,String datevalue) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+datevalue+"');",element);
		
		
	}
}
