package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class html_Webtable2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/directory");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table']//thead//tr/th"));
		System.out.println(cols.size());
		int colindex = 0;
		for (int i = 0; i < cols.size(); i++) {
			
			System.out.println(cols.get(i).getText());
			
			if ("Company Name".equalsIgnoreCase(cols.get(i).getText())) {
				
				colindex = i;
				break;
			}

		}
		System.out.println("colindex: " + colindex);

		// Verify specific company
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));
		System.out.println(rows.size());
		String rowsxp1 = "//table[@class='table']/tbody/tr[";
		String rowsxp2 = "]/td[1]";
		boolean flag = false;
		for (int i = 1; i < rows.size(); i++) {
			String xpath = rowsxp1 + i + rowsxp2;
			WebElement element = driver.findElement(By.xpath(xpath));
			String val = element.getText();
			System.out.println(val);
			if ("8COMMON LIMITED".equalsIgnoreCase(val)) {
				flag = true;
				System.out.println("found in row: " + i);
				break;
			}

		}

	}

}
