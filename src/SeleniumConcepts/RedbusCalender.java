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

public class RedbusCalender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.redbus.com/");
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='onward_cal']")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
		
		String monthyear= driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText();
		System.out.println(monthyear);
		
		String month=monthyear.split(" ")[0];
		String year=monthyear.split(" ")[1];
		
		System.out.println(month);
		System.out.println(year);
		
		while(!(month.equals("Dec")&&year.equals("2022"))){
			
			driver.findElement(By.xpath("(//button[contains(text(),'>')])[2]")).click();
			monthyear= driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText();
			System.out.println(monthyear);
			month=monthyear.split(" ")[0];
			year=monthyear.split(" ")[1];
			
		}
		driver.findElement(By.xpath("//td[@class='wd day' and text()='9']")).click();
			
		}
		
		
		
	}
