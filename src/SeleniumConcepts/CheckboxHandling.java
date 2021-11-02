package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {

	public static void main(String[] args) throws Exception {
	WebDriver driver;
	driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	WebElement checkbox=driver.findElement(By.xpath("//label[text()='Option 2']"));
	checkbox.click();
	Thread.sleep(2000);
	boolean status=checkbox.isEnabled();
	
	if(status) {
		
		System.out.println("Passed");
	}else {
		
		System.out.println("Failed");
	}
	
	

	}

}
