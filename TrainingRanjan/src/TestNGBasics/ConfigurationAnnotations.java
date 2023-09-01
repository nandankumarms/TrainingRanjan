package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {

	@BeforeSuite
	public void beforSuitMethod() {
		System.out.println("Before suit");
	}
	
	@BeforeTest
	public void beforTestMethod() {
		System.out.println("Before test");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTestMethod() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuitMethod() {
		System.out.println("After suit");
	}
	
	@BeforeClass
	public void beforClassMethod() {
		System.out.println("Before Class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@Test()
	public void testMethod() {
		System.out.println("test");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("test2");
	}
}
