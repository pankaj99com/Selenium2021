package XpathLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAxes {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://money.rediff.com/gainers");
		//1 Self
		String text=driver.findElement(By.xpath("//a[contains(text(),'Centrum Capital')]/self::a")).getText(); 
		//Same node will be identified
		System.out.println(text);

		
		//2.parent
		
		String text1=driver.findElement(By.xpath("//a[normalize-space()='Ami Organics']/parent::td")).getText();
		System.out.println(text1);
		
		//3 //a[normalize-space()='Ami Organics']/child::* use * to know if any child nodes exists
		
		
		//4 child
		List<WebElement> childs=driver.findElements(By.xpath("//a[normalize-space()='Ami Organics']/ancestor::tr/child::td"));
		
	
		int size=childs.size();
		System.out.println("Number of childs"+size);
		
		//5 ancestor
		
		String text2=driver.findElement(By.xpath("//a[normalize-space()='Ami Organics']/ancestor::tr")).getText();
		
		System.out.println(text2);
		
		//Descendant
		List<WebElement> desc=driver.findElements(By.xpath("//a[normalize-space()='Ami Organics']/ancestor::tr/descendant::*"));
		
		int size1=desc.size();
		System.out.println("Number of descendaants are:"+size1);
		
		//Following
		List<WebElement> follow=driver.findElements(By.xpath("//a[normalize-space()='Ami Organics']/ancestor::tr/following::tr"));
		System.out.println("Number of Following nodes: " +follow.size());
		
		//Following-sibling
		List<WebElement> followsib=driver.findElements(By.xpath("//a[normalize-space()='Ami Organics']/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of Following-sibling nodes: " +followsib.size());
		
		//preceeding
		
		List<WebElement> preedings=driver.findElements(By.xpath("//a[normalize-space()='Ami Organics']/ancestor::tr/preceding::tr"));
		
		System.out.println("number of preceding elementes: "+ preedings.size());
		
		
		List<WebElement> presib=driver.findElements(By.xpath("//a[normalize-space()='Ami Organics']/ancestor::tr/preceding-sibling::tr"));
		
		System.out.println("Number of preceding siblings are: " +presib.size());
		
		driver.close();
	}

}
