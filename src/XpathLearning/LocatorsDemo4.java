package XpathLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo4 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		// 1.xpath option ->OR
		// either of the statement is matching then it will able to locate the
		// element
		// driver.findElement(By.xpath("//input[@id='search_query_top' or
		// @name='search_query'] ")).sendKeys("Dress");

		// 2.xapth option ->AND
		// Both the statement should match in order to ocate the element
		// driver.findElement(By.xpath("//input[@id='search_query_top' and
		// @name='search_query1'] ")).sendKeys("Dress");

		// <input class="search_query form-control ac_input" type="text"
		// id="search_query_top" name="search_query" placeholder="Search"
		// value="" autocomplete="off" style="" xpath="1">

		// 3.Xpath option ->contains()
		// tagname[contains(@attribute,'value')]
		// in value we can give the partial text/values as well

		//driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("Top");

		// 4.Xpath option ->starts-with()
		// <button type="submit" name="submit_search" class="btn btn-default
		// button-search" xpath="1">
		// <span>Search</span>
		// </button>

		// input[starts-with(@class,'search')]
		//driver.findElement(By.xpath("//button[starts-with(@name,'submit')]")).click();

		// 5.xpath option ->text()

		// <a
		// href="http://automationpractice.com/index.php?id_category=3&amp;controller=category"
		// title="Women" class="sf-with-ul" style="" xpath="1">Women</a>

		// a[text()='Women']

		//driver.findElement(By.xpath("//a[text()='Women']")).click();

		// 6.Chained xpath
		
		// <form id="searchbox" method="get"
		// action="http://automationpractice.com/index.php?controller=search"
		// xpath="1">
		// <input type="hidden" name="controller" value="search">
		// <input type="hidden" name="orderby" value="position">
		// <input type="hidden" name="orderway" value="desc">
		// <input class="search_query form-control ac_input" type="text"
		// id="search_query_top" name="search_query" placeholder="Search"
		// value="" autocomplete="off" style="">
		// <button type="submit" name="submit_search" class="btn btn-default
		// button-search">
		// <span>Search</span>
		// </button>
		// </form>
		
		
		//We can write multiple xpaths in order to identify the element
		//form[@id='searchbox']//input[4]
		
		driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("jeans");
		
		//driver.findElement(By.xpath("//form[@id='searchbox']//button")).click();
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@type='submit']")).click();
		
		
		
		

	}

}
