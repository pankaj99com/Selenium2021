package SeleniumUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestUtil {
	public static void highLightElement(WebDriver driver, WebElement element)
	{
	
	//Creating javascript reference variable	
	JavascriptExecutor js=(JavascriptExecutor)driver; 
	
	//Setting up the Style as Background Yellow and Border to be 2Pixel width in Red Colour for WebElement
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	
	try 
	{
		
	//Wait for JavaScript to be visible in slow 
	Thread.sleep(1000);
	
	} 
	
	catch (InterruptedException e)
	{
	
	//Catch if any exception occure during runtime
	System.out.println(e.getMessage());
	
	} 
	
	//Changing the WebElement Properties as original Attributes
	//As Border Yellow to White Colour with 2Pixel Border Size
	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 

	}
	
	
	
	
}
