package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/account");
		

		WebElement source = driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		WebElement dest = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(source).moveToElement(dest).click().perform();
	}

}
