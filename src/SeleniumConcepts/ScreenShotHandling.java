package SeleniumConcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

 public class ScreenShotHandling {
	 static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Screenshot("D://Pankaj-QA//ScriptsScreeshots//","Facebook",driver);
	}
	
	public static void Screenshot(String filepath,String name,WebDriver driver) throws IOException {
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File(filepath+name+".png"));
	}

}
