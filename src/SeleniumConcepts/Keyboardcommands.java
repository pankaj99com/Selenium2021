package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardcommands {

	public static void main(String[] args) {
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("https://spreadsheetpage.com/calendar/yearly/#model_1");
		driver.findElement(By.xpath("//input[@id='submit']")).sendKeys(Keys.PAGE_DOWN);
		
	}

}
