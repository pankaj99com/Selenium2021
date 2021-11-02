package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("file:///D:/Pankaj-QA/MY%20WEB/myslider.html");
		WebElement slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println(slider.getLocation());
		System.out.println(slider.getSize());
		Actions action=new Actions(driver);
		action.dragAndDropBy(slider, 200, 0).perform();
		System.out.println(slider.getLocation());
		WebElement slider1=driver.findElement(By.xpath("//span[2]"));
		Thread.sleep(5000);
		action.dragAndDropBy(slider1, -200,0).perform();
		
		
	}

}
