package SeleniumConcepts;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {
public static void main(String[] args) throws IOException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.com/");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	List<String> ulList=new ArrayList<String>();
	for(WebElement e:links){
		String url=e.getAttribute("href");
		//ulList.add(url);
		checkBrokenLink(url);
		
	}
	
	
		
	}
public static void checkBrokenLink(String linkurl) throws IOException{
	try {
		URL url= new URL(linkurl);
		
			HttpURLConnection httpurlconnection=(HttpURLConnection) url.openConnection();
			httpurlconnection.setConnectTimeout(5000);
			httpurlconnection.connect();
			
			if(httpurlconnection.getResponseCode()>=400){
				System.out.println(linkurl +"------->"+httpurlconnection.getResponseMessage()+"is a broken link");
			}else{
				System.out.println(linkurl +"------->"+httpurlconnection.getResponseMessage());
			}
		
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
}


