package SeleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.get("http://www.amazon.com");
		// TakesScreenshot scrShot =((TakesScreenshot)driver);
		// File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//

		// File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyfile(src,new File("D:/Pankaj-QA/ScriptsScreeshots"));
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:/Pankaj-QA/ScriptsScreeshots/test.png"));

	}

}
