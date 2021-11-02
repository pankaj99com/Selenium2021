package TestNGPackage;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=1000)
	
	public void sum(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(" sum of a and  b is:"+c);
	}

}
