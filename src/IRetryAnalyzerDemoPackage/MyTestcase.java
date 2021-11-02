package IRetryAnalyzerDemoPackage;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTestcase {
	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	public void test1(){
		Assert.assertEquals(true, false);
	}
	
	
	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	public void test2(){
		Assert.assertEquals(true, false);
	}
}
