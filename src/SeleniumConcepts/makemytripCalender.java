package SeleniumConcepts;

import java.time.Year;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class makemytripCalender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@data-cy='departureDate']")));
		Thread.sleep(4000);
		driver.findElement(By.className("langCardClose")).click();
		Thread.sleep(8000);
		driver.findElement(By.className("//div[contains(@class,'loginModal displayBlock modalLogin dynHeight personal')]")).click();
		
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		String YearMonthval=driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']")).getText();
		String month=YearMonthval.split(" ")[0].trim();
		String year=YearMonthval.split(" ")[1].trim();
		System.out.println(YearMonthval);
		
	}
}