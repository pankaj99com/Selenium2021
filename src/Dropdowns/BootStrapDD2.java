package Dropdowns;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDD2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
        driver.get("https://semantic-ui.com/modules/dropdown.html");
        driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple']")).click();
        Thread.sleep(4000);
       driver.findElement(By.xpath("//div[@class='menu transition visible']//div[8]")).click();  
       Thread.sleep(4000);
       driver.findElement(By.xpath("//div[@class='menu transition visible']//div[9]")).click();
       Thread.sleep(4000);
       List<WebElement> li=driver.findElements(By.xpath("//div[@class='menu transition visible']//child::*"));
       System.out.println(li.size());
       for(int i=0;i<li.size();i++) {
    	   
    	  String s= li.get(i).getText();
    	  System.out.println(s);
    	  
    	  if(s.equals("HTML")) {
    		  li.get(i).click();
    		  
    	  }
       }
	}

}
