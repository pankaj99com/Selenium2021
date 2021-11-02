package Dropdowns;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDD {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.findElement(By.xpath("//button[@id='menu1']")).click();
        List<WebElement> dd_list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
        for(int i=0;i<dd_list.size();i++) {
        	
        	WebElement ele=dd_list.get(i);
        	System.out.println("Using gettext method" +ele.getText());
        	String innerhtml=ele.getAttribute("innerHTML");
        	System.out.println(innerhtml);
        	
        }
	}

}
