package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

	public static void main(String[] args) throws Exception {
	WebDriver driver;
	driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	WebElement radio=driver.findElement(By.xpath("//input[@name='ageGroup' and @value='5 - 15']"));
	radio.click();
	Thread.sleep(2000);
	boolean status=radio.isEnabled();
	
	if(status) {
		
		System.out.println("Passed");
	}else {
		
		System.out.println("Failed");
	}
	
	

	}

}
