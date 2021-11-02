package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleDropdownList2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
//		<select class="form-control" id="select-demo" xpath="1">
//		<option value="" selected="" disabled="">Please select</option>
//		 <option value="Sunday">Sunday</option>
//		  <option value="Monday">Monday</option>
//		  <option value="Tuesday">Tuesday</option>
//		  <option value="Wednesday">Wednesday</option>
//		  <option value="Thursday">Thursday</option>
//		  <option value="Friday">Friday</option>
//		  <option value="Saturday">Saturday</option>
//	  </select>
		WebElement ele=driver.findElement(By.id("select-demo"));
		ele.sendKeys("Monday");
		System.out.println("Slecting value using simple send keys method");
		
		Thread.sleep(5000);
		Select select=new Select(ele);
		List<WebElement> option=select.getOptions();
		System.out.println(option.size());
		for(int i=0;i<option.size();i++) {
			
			//System.out.println(option.get(i).getText());
			if(option.get(i).getAttribute("innerText").contains("Tuesday")) {
				option.get(i).click();
				System.out.println(option.get(i).getText());
				System.out.println("Selecting the value using select class method");
				break;
			}
			
		}
		

	}

}
