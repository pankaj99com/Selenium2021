package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipHandling {

	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	
	driver.get("https://en.wikipedia.org/wiki/Tooltip");
	
	WebElement tooltip=driver.findElement(By.xpath("//p//a[contains(text(),'graphical user interface')][1]"));
	Actions action=new Actions(driver);
	action.moveToElement(tooltip).build().perform();
	
	String text=tooltip.getAttribute("innerHTML");
	System.out.println(text);
}
}