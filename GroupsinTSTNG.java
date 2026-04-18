package projects.Automationmaven;

import org.testng.annotations.Test;

public class GroupsinTSTNG {
	
	@Test(groups= {"Smoke"})
	public void test1() {
		
		System.out.println("Test Case 1");
		
	}
	@Test(groups= {"Smoke","System"})
	public void test2() {
		
		System.out.println("Test Case 2");
		
	}
	@Test(groups= {"Smoke"})
	public void test3() {
		
		System.out.println("Test Case 3");
		
	}
	@Test(groups= {"Smoke","System"})
	public void test4() {
		
		System.out.println("Test Case 4");
		
	}
	@Test(groups= {"System"})
	public void test5() {
		
		System.out.println("Test Case 5");
		
	}
	@Test(groups= {"Smoke"})
	public void test6() {
		
		System.out.println("Test Case 6");
		
	}

}
