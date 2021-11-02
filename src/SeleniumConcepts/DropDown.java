package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	
	static WebDriver driver;

	public static void main(String... abc) {
		driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		By coun = By.id("country");
		// Select select=new Select(driver.findElement(country));
		// select.selectByVisibleText("Austria");

		doSelectByVisibleText(coun, "Austria");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		doSelectByVisibleText(coun,"Chile");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);

	}

}
