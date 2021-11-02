package RobotClassDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		
		//<input type="file" name="uploadfile_0" class="upload_txt" id="uploadfile_0" size="40">
	   WebElement upload= driver.findElement(By.cssSelector("input#uploadfile_0"));
	   upload.click();
		Robot robot=new Robot();
		robot.mousePress(KeyEvent.VK_TAB);
		robot.mousePress(KeyEvent.VK_TAB);
		robot.mousePress(KeyEvent.VK_TAB);
		robot.mousePress(KeyEvent.VK_ENTER);
		

	}

}
