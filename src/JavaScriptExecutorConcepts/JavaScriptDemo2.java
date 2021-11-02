package JavaScriptExecutorConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptDemo2 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String btn = js.executeScript("return document.getElementById('submitbtn').innerHTML").toString();
		System.out.println(btn);
		//1.scroll till some height
		
		//js.executeScript("window.scrollBy(0,500)");
		
		
		//2.Scroll till end of the page
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//3.Scroll till the particular element in View
		js.executeScript("document.getElementById('Skills').scrollIntoView()");

	}

}
