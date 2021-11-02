package SeleniumConcepts;

import java.time.Duration;
import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
		
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(40))
		       .pollingEvery(Duration.ofSeconds(1))
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 
		    	WebElement ele= driver.findElement(By.xpath("//p[@id='demo']"));
		    	String value=ele.getAttribute("innerHTML");
		    	if(value.equalsIgnoreCase("WebDriver")) {
		    		return ele;
		    	}
		    	else {
		    		System.out.println("TEXT which is comming on the scrren is"+value);
		    		
		    		return null;
		    	}
		     
		     }
		   });
		 System.out.println("Element is displayed ?"+element.isDisplayed());
		

	}

}
