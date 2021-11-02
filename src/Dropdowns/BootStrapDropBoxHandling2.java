package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapDropBoxHandling2 {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new FirefoxDriver();

		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++){
			System.out.println(li.get(i).getText());
			if(li.get(i).getText().contains("Another action")){
				li.get(i).click();
				System.out.println("PASSED");
			}
			
		}
		
		driver.get("file:///D:/Pankaj-QA/MY%20WEB/Bootstrapdropdown.html#");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement> li1=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
		System.out.println(li1.size());
		for(int i=0;i<li1.size();i++){
			System.out.println(li1.get(i).getText());
		}
	}
}
