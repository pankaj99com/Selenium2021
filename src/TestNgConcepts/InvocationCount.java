package TestNgConcepts;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=20)
	public void sum() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		System.out.println(Thread.currentThread().getId());
	}

}
