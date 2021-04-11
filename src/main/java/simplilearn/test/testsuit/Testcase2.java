package simplilearn.test.testsuit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase2 {
	
	@BeforeMethod
	 public void beforeMethod() {
		 System.out.println(" This is BeforeMethod");
	 }
	
	@AfterMethod
	public void afterMethod() {
		 System.out.println(" This is AfterMethod");
	}
	
	@BeforeTest
	 public void beforeTest() {
		 System.out.println(" This is beforeTest");
	 }
	
	@AfterTest
	public void afterTest() {
		 System.out.println(" This is AfterTest");
	}
	
	@BeforeSuite
	 public void beforeSuit() {
		 System.out.println(" This is beforeSuit");
	 }
	
	@AfterSuite
	public void afterSuit() {
		 System.out.println(" This is AfterSuit");
	}
	
	@Test
	 public void Test1() {
		 System.out.println(" This is test1");
	 }
	
	@Test
	 public void Test2() {
		 System.out.println(" This is test2");
	 }

}
