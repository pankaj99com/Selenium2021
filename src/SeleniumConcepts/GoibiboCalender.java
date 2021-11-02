package SeleniumConcepts;

import java.time.Year;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoibiboCalender {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!ETA!108599293!6504095653!491619965162!e!goibibo!c!&ef_id=CjwKCAjw8KmLBhB8EiwAQbqNoMTjDaGQkv903ZwbsTRJ1wnO4BUOWD91TTaXVOZOcpEscqUn-hRn8RoC0GYQAvD_BwE:G:s&gclid=CjwKCAjw8KmLBhB8EiwAQbqNoMTjDaGQkv903ZwbsTRJ1wnO4BUOWD91TTaXVOZOcpEscqUn-hRn8RoC0GYQAvD_BwE");
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='departureCalendar']")));
		
		driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
		String YearMonthval=driver.findElement(By.xpath("//div[@role='heading']")).getText();
		String month=YearMonthval.split(" ")[0].trim();
		String year=YearMonthval.split(" ")[1].trim();
		System.out.println(YearMonthval);
		
		
		while(!(month.equals("December")&& year.equals("2022"))){
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			YearMonthval=driver.findElement(By.xpath("//div[@role='heading']")).getText();
			System.out.println(YearMonthval);
			month=YearMonthval.split(" ")[0].trim();
			year=YearMonthval.split(" ")[1].trim();
			
			
			
		}
		driver.findElement(By.xpath("//div[text()='15']")).click();

	}

}
