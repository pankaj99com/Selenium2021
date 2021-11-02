package TestNgConcepts;

import org.testng.annotations.Test;

public class InvocationTimeOutTest {

	@Test(invocationTimeOut=2)
	
	public void test() {
		int i=1;
		while(i==1) {
			
			System.out.println("running");
			
		}
	}
}
