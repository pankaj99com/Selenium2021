package JavaScriptExecutorConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptDemo {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// 1.Title using JS
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);

		// 2.Domain name using JS

		String DomainName = js.executeScript("return document.domain;").toString();

		System.out.println(DomainName);

		// 3. InnerHTML using JS
		String btntext = js.executeScript("return document.getElementById('Form_submitForm_action_request').innerHTML")
				.toString();

		System.out.println(btntext);

		// 4.Insert in input field using JS-QuerySelector
		js.executeScript("document.querySelector('input.labeledtext').value='pankaj99'");
		js.executeScript("document.querySelector('input.text').value='pankaj'");
		js.executeScript("document.querySelector('input#Form_submitForm_Email').value='java8.com@gmail.com'");
		js.executeScript("document.querySelector('input#Form_submitForm_Contact').value='8431688940'");
		js.executeScript("document.querySelector('select#Form_submitForm_Country').value='India'");

		// 4.Identify the elemeny using JS mrthod:getElemtById
		js.executeScript("document.getElementById('Form_submitForm_SetDummyData').checked=true");
		WebElement button = driver.findElement(By.xpath("//input[@id='Form_submitForm_action_request']"));

		// 5.JS method using arguement[0]
		js.executeScript("arguments[0].click();", button);
		System.out.println("Clicked on Submit button");

		// 6.Alert popup on the webpage
		js.executeScript("alert('Hello World');");

		// 7.Refresh a page
		// js.executeScript("history.go(0)");

	}

}
