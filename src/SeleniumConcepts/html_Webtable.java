package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class html_Webtable {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id='customers']/tbody/tr[2]/td[1]
		//*[@id='customers']/tbody/tr[3]/td[1]
		//*[@id='customers']/tbody/tr[4]/td[1]
		//*[@id='customers']/tbody/tr[5]/td[1]
		//*[@id='customers']/tbody/tr[6]/td[1]
		//*[@id='customers']/tbody/tr[7]/td[1]
		
	String rowsxp1=	"//*[@id='customers']/tbody/tr[";
	String rowsxp2=	"]/td[1]";

	for(int i=2;i<=7;i++) {
		String xpath=rowsxp1+i+rowsxp2;
		WebElement element=driver.findElement(By.xpath(xpath));
		
		System.out.println(element.getText());
		
		if(element.getText().equals("Island Trading")) {
			System.out.println("Element :"+element.getText()+" is found" + "at postion: "+(i-1));
			break;
			
		}
		
	}
		
		//body/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/div[1]
	}

}
