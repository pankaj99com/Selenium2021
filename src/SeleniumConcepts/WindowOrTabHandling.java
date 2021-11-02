package SeleniumConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOrTabHandling {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new ChromeDriver();
		driver.get("https://my.naukri.com/account/createaccount");

		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//a[text()='FAQs']")).click();

		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println("total counts of windows:" + count);

		for (String child : allwindows) {

			if (!parentwindow.equals(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//input[@id='keyword_search']")).sendKeys("How");
				driver.findElement(By.xpath("//button[@type='submit' ]/child::*")).click();
				driver.close();
			}
		}

		driver.switchTo().window(parentwindow);
		String title = driver.getTitle();
		System.out.println(title);

	}

}
