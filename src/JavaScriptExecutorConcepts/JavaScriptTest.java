package JavaScriptExecutorConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptTest {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		//js.executeScript(script, argument)
		//driver=new FirefoxDriver();
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
//		driver.get("http://demo.automationtesting.in/Register.html");
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='pankaj99.com@gmail.com'");
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		js.executeScript("document.getElementById('enterimg').click()");
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//QuerySelector method should be used with class only
		//js.executeScript("history.go(0)");
		js.executeScript("document.querySelector(\"input[placeholder='First Name']\").value='pankajkumar';");
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//js.executeScript("history.go(0)");
		
		//js.executeScript("document.getElementById('btn2').click()");
		//How to get inner html using javascript
//		String html=js.executeScript("return document.getElementById('btn2').innerHTML").toString();
//		System.out.println(html);
//		
//		String title=js.executeScript("return document.title").toString();
//		System.out.println(title);
//		js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("document.getElementById('Skills').scrollIntoView()");
		
//		js.executeScript("document.getElementById('enterimg').click()");
//		Thread.sleep(8000);
		js.executeScript("window.history.back()");
		Thread.sleep(8000);
		js.executeScript("window.history.forward()");
	}
	

}
