package SeleniumConcepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		int total_no_of_Links=list.size();
		System.out.println(total_no_of_Links);
		for(WebElement e:list) {
			String url=e.getAttribute("href");
			checkbrokenlinks(url);
		}
	}
public static void checkbrokenlinks(String linkurl) throws IOException {
	try {
		URL url=new URL(linkurl);
		HttpURLConnection httpurlConnection=(HttpURLConnection) url.openConnection();
		httpurlConnection.setConnectTimeout(5000);
		httpurlConnection.connect();
		
		
		if(httpurlConnection.getResponseCode()>=400) {
			System.out.println(linkurl +"------->"+httpurlConnection.getResponseMessage()+"is a broken link");
		}else {
			System.out.println(linkurl +"------->"+httpurlConnection.getResponseMessage());
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
