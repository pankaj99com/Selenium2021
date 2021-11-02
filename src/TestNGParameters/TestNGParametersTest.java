package TestNGParameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class TestNGParametersTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","emailid","password"})
	
	public void YahooLoginTest(String browsername,String urlname,String email,String pwd){
		
		
		if(browsername.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Selenium2021\\chromedriver.exe" );
			driver=new ChromeDriver();
			
		}else if(browsername.equals("firefox")){
			driver=new FirefoxDriver();
		}
		
		
		driver.get(urlname);
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(email);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("login-passwd")).sendKeys(pwd);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.id("login-signin")).click();
	
	
		driver.quit();
		
	}

}
