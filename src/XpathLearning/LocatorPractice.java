package XpathLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorPractice {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://demo.wpeverest.com/user-registration/");
		driver.findElement(By.xpath("//button[@type='submit']/parent::*/parent::*/child::div[1]/div[1]//input")).sendKeys("Pankaj");
		driver.findElement(By.xpath("//form[@class='register']//child::div/button")).click();

	}
}
