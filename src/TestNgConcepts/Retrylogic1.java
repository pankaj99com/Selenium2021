package TestNgConcepts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrylogic1 implements IRetryAnalyzer  {
	
	int counter=0;
	int limit=4;

	@Override
	public boolean retry(ITestResult result) {
		
		if(counter<limit) {
			counter++;
			return true;
		}
		
		
		return false;
	}

}
