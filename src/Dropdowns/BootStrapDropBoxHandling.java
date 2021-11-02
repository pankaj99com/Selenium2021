package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapDropBoxHandling {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new FirefoxDriver();

		driver.get("https://www.jqueryscript.net/demo/Bootstrap-Style-Dropdown-Menu-Plugin-jQuery/");
		driver.findElement(By.xpath("//div[contains(text(),'Default Dropdown Menu')]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown open']//ul[@class='dropdown-menu']"));
		System.out.println(list.size());
		System.out.println(list.get(0).getText());

		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.findElement(By.xpath("//div[@class='dropdown example']//div[@class='ui fluid search selection dropdown']")).click();
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='menu transition visible']//div[@class='item']"));
		System.out.println(li.size());

		for (int i = 0; i < li.size(); i++) {

			System.out.println(li.get(i).getText());
			if (li.get(i).getText().contains("India")) {
				li.get(i).click();
				break;
			}
		}

		// for (int i = 0; i < li.size(); i++) {
		//
		// System.out.println(li.get(i).getText());
		//
		// li.get(i).click();//ElementNotInteractableException:
		// driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		// }

	}
}
