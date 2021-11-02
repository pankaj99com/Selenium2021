package TestNgConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogicTest {
	@Test(retryAnalyzer=Retrylogic.class)
	public void test1(){
		Assert.assertEquals(true, false);
	}
	
	
	
}