package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFileUploadPopUps {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver=new FirefoxDriver();
		//driver.get("https://html.com/input-type-file/");
		driver.get("file:///D:/Pankaj-QA/MY%20WEB/fileupload.html");
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("D:\\Pankaj-QA\\MY WEB\\fileupload.txt");
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	    
	}

}
