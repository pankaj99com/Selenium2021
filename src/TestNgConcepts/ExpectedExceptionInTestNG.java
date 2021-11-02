package TestNgConcepts;

import org.testng.annotations.Test;

public class ExpectedExceptionInTestNG {
	
	@Test(expectedExceptions=NumberFormatException.class)
	
	public void test() {
		String str="10A";
		Integer.parseInt(str);
	}

}
