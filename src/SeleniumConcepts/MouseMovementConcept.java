package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) {

		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bobology.com/public/What-is-a-Mouse-Over-or-Mouse-Hover.cfm");
		driver.findElement(By.xpath("//a[normalize-space()='Accept']")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Subjects')]"))).build().perform();
//		driver.findElement(By.xpath("//a[text()='Mobile App Business']")).click();
//		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
////		JavascriptExecutor js=(JavascriptExecutor) driver;
////		js.executeScript("document.querySelector(\"a[Title='Personal Computers']\").click();");
//		//driver.findElement(By.xpath("//a[text()='Mobile App Business']")).click();
//		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//		System.out.println(driver.getTitle());
//		
		
		

	}

}
