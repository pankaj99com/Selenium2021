package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class html_Webtable3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/37672/dc-vs-kkr-qualifier-2-indian-premier-league-2021");
		Thread.sleep(5000);
		
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']"));
		System.out.println(rows.size());
		String rowsxp1 = "//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[";
		String rowsxp2 = "]";
		boolean flag =false;
		for (int i = 2; i < rows.size(); i++) {
			String xpath = rowsxp1 + i + rowsxp2;
			WebElement element = driver.findElement(By.xpath(xpath));
			String val=element.getText();
			System.out.println(val);
			

		}
		
	}

}
