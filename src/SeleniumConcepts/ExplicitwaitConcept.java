package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitConcept {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new FirefoxDriver();
		driver.get("http://wwww.amazon.com");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Sell')]")));
		element.click();
		// Element highlighter Method Code with two Arguments as "driver and
		// WebElement to be highlighted"

		highLightElement(driver, driver
				.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Sell')]")));

	}

	public static void highLightElement(WebDriver driver, WebElement element) {

		// Creating javascript reference variable
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Setting up the Style as Background Yellow and Border to be 2Pixel
		// width in Red Colour for WebElement
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		try {

			// Wait for JavaScript to be visible in slow
			Thread.sleep(1000);

		}

		catch (InterruptedException e) {

			// Catch if any exception occure during runtime
			System.out.println(e.getMessage());

		}

		// Changing the WebElement Properties as original Attributes
		// As Border Yellow to White Colour with 2Pixel Border Size
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}
}
