package XpathLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo3 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		// Using CSS SELECTROR
		// <input type="text" class="inputtext _55r1 _6luy" name="email"
		// id="email" data-testid="royal_email" placeholder="Email address or
		// phone number" autofocus="1" aria-label="Email address or phone
		// number">

		// Tagname#id
		// driver.findElement(By.cssSelector("input#email")).sendKeys("pankaj"); //or simple #email
		// driver.findElement(By.cssSelector("input.inputtext")).sendKeys("kumar");
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Pankaj99");

		// <input type="text" class="inputtext _55r1 _6luy" name="email"
		// id="email" data-testid="royal_email" placeholder="Email address or
		// phone number" autofocus="1" aria-label="Email address or phone
		// number">
		
		
		// <input type="password" class="inputtext _55r1 _6luy _9npi"
		// name="pass" id="pass" data-testid="royal_pass" placeholder="Password"
		// aria-label="Password">
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Admin@123");
	}

}
