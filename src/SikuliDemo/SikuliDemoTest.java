package SikuliDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemoTest {

	public static void main(String[] args) throws FindFailed {
	WebDriver driver;
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=5uCQPkB0Bac");
	Screen sc=new Screen();
	Pattern settings=new Pattern("C:\\Users\\pankaj.kumar\\workspace\\Selenium2021\\src\\SikuliDemo\\settings.png");
	sc.wait(settings,9000);
	sc.click();
	

//	Pattern skip=new Pattern("C:\\Users\\pankaj.kumar\\workspace\\Selenium2021\\src\\SikuliDemo\\skip.png");
//	sc.wait(skip,9000);
//	sc.click();
	
	Pattern play=new Pattern("C:\\Users\\pankaj.kumar\\workspace\\Selenium2021\\src\\SikuliDemo\\play.png");
	sc.wait(play,9000);
	sc.click();
	Pattern pause=new Pattern("C:\\Users\\pankaj.kumar\\workspace\\Selenium2021\\src\\SikuliDemo\\pause.png");
	sc.click();
	sc.highlight();
	sc.click();
	
	}

}
