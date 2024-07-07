package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
	public void doThis() {
		System.out.println("Hello World by using inheritance");
	}
	@AfterMethod
	public void doThis2() {
		System.out.println("Test inherited trait");
	}
	@BeforeMethod
	public void befoMethod1() {
		System.out.println("Use the beforeMethods");
	}
}
