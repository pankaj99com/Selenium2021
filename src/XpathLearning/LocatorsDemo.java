package XpathLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		// <input class="search_query form-control ac_input" type="text"
		// id="search_query_top" name="search_query" placeholder="Search"
		// value="" autocomplete="off">

		// 1.BY ID
		driver.findElement(By.id("search_query_top")).sendKeys("Printed Dress");

		// <button type="submit" name="submit_search" class="btn btn-default
		// button-search">
		// <span>Search</span>
		// </button>

		// 2.BY NAME
		driver.findElement(By.name("submit_search")).click();
		
		// <a class="product-name"
		// href="http://automationpractice.com/index.php?id_product=7&amp;controller=product"
		// title="" xpath="1">
		// Printed Chiffon Dress
		// </a>
		
        //3.BY LinkText and PartialLinkText
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Chiffon")).click();

	}

}
