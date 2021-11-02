package Actions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressEvents {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		
		System.out.println(driver.manage().getCookies());
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Set<Cookie> allcookies=driver.manage().getCookies();
		driver.manage().deleteAllCookies();
		for(Cookie cookie:allcookies) {
			System.out.println(cookie.getName()+cookie.getValue());
			
			System.out.println(cookie.getName()+cookie.getValue());

			
		}
		Actions action = new Actions(driver);//D:\Pankaj-QA\SELENIUM SOFTWARES\WebDriverMnager
		action.sendKeys(Keys.ENTER).perform();//we need to download WebDriverManager which will help us to handle keys events through Actions class
		action.sendKeys(Keys.ADD).perform();
		

	}

}
