package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		

		WebElement source = driver.findElement(By.id("box1"));
		
		WebElement dest = driver.findElement(By.id("box101"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, dest).perform();;
	}

}
