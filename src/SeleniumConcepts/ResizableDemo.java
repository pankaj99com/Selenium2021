package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableDemo {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement resizable=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		System.out.println(resizable.getSize());
		Actions action =new Actions(driver);
		action.moveToElement(resizable).dragAndDropBy(resizable, 100, 100).build().perform();

	}

}
