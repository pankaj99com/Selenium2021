package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("PANKAJ");
		Thread.sleep(2000);
		List<WebElement> li=driver.findElements(By.tagName("span"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++) {
			
			String name=li.get(i).getAttribute("innerText");
			System.out.println(name);
		}
		

	}

}
