package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import SeleniumUtility.TestUtil;

public class HandleJavaScriptPopups {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		String text=alert.getText();
		if(text.equals("Please enter a valid user name")){
			System.out.println("Correct Alert message");
		}else{
			System.out.println("Wrong Alert Message");
		}
		alert.accept();// to accept
		// alert.dismiss(); to dismiss if cancel button is present in popup
		

	}

}
