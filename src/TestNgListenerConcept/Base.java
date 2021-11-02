package TestNgListenerConcept;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	public static WebDriver driver;
	
	public static void initialization() {
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	public void failed(String methodname) {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
		 String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			FileUtils.copyFile(src, new File("C:\\Users\\pankaj.kumar\\workspace\\Selenium2021\\Screenshots\\"+"failedSS"+"_"+methodname+"_"+timestamp+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
