package ListenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Starting my test " +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("MY test is succeeeded " +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Alert!!Test Failed " +result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Warn!!!Test is skipped " +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("NA  " +result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start " +context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish " +context.getName());
		
	}

}
