package XpathLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		// <li class="homeslider-container bx-clone" style="float: left;
		// list-style: none; position: relative; width: 779px;" xpath="1">
		// <a href="http://www.prestashop.com/?utm_source=v16_homeslider"
		// title="sample-3">
		// <img
		// src="http://automationpractice.com/modules/homeslider/images/sample-3.jpg"
		// width="779" height="448" alt="sample-3">
		// </a>
		// <div class="homeslider-description"><h2>EXCEPTEUR<br>OCCAECAT</h2>
		// <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin
		// tristique in tortor et dignissim. Quisque non tempor leo. Maecenas
		// egestas sem elit</p>
		// <p><button class="btn btn-default" type="button">Shop now
		// !</button></p></div>
		// </li>
		
		
		//By.clasName
		int no_of_slides=driver.findElements(By.className("homeslider-container")).size();
		System.out.println(no_of_slides);
		
		
		//BY tag name
		
		int no_of_links=driver.findElements(By.tagName("a" )).size();
		System.out.println(no_of_links);
		int no_of_input=driver.findElements(By.tagName("input" )).size();
		System.out.println(no_of_input);
	}

}
