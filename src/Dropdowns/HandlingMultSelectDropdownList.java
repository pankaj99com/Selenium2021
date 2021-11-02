package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultSelectDropdownList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
//		<select size="10" name="States" multiple="multiple" id="multi-select" style="width:200px" xpath="1">
//		<option value="California">California</option>
//		<option value="Florida">Florida</option>
//		<option value="New Jersey">New Jersey</option>
//		<option value="New York">New York</option>
//		<option value="Ohio">Ohio</option>
//		<option value="Texas">Texas</option>
//		<option value="Pennsylvania">Pennsylvania</option>
//		<option value="Washington">Washington</option>
//	</select>
	Select ele=new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
	ele.selectByVisibleText("Texas");
	ele.selectByIndex(3);
		
	}

}
