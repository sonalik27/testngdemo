package simplilearn.test.testsuit;

import org.testng.annotations.Test;

public class Testcase1 {
	
//	@Test(groups = {"sanity"})
//	 public void Test1() {
//		 System.out.println(" This is test1");
//	 }
//	
//	@Test(description = "This is TEST2:)")
//	 public void Test2() {
//		 System.out.println(" This is test2");
//	 }
//	
//	@Test(groups = {"sanity"})
//	 public void otherTest() {
//		 System.out.println(" This is otherTest");
//	 }
	
	@Test
    public void test1() {
        
        System.out.println("Inside Test1");
    }
    
    @Test(description="This is test2")
    public void test2() {
        
        System.out.println("Inside Test2");
    }
    
    @Test(dependsOnMethods="test2")
    public void othertest() {
        
        System.out.println("Inside othertest");
    }


}
