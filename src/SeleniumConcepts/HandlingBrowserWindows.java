package SeleniumConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		//driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		String title = driver.getTitle();
		 System.out.println(title);
		Set<String> s = driver.getWindowHandles();
		for (String i : s) {
			System.out.println(i);
			String t = driver.switchTo().window(i).getTitle();
			System.out.println(t);
			if (t.contains("Frames & windows")) {
				driver.close();
			}
			if(t.contains("Selenium")){
				driver.close();
			}

		}

	}

}
