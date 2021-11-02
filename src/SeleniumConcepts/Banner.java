package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Banner {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
//WebElement banner=driver.findElement(By.xpath("//marquee[contains(text(),'15CA/CB')]"));
ScreenShotHandling.Screenshot("D://Pankaj-QA//ScriptsScreeshots//","banner",driver);
//System.out.println(banner.getText());

	}

}
