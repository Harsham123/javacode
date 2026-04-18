package projects.Automationmaven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All9Annotation {
	
	@BeforeSuite
	public void BS() {
		System.out.println("BS");
		
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("BT");
		
	}
	@BeforeClass
	public void BC() {
		System.out.println("Bc");
		
	}
	@BeforeTest
	public void BM() {
		System.out.println("BM");
		
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("AS");
		
	}
	
	@AfterTest
	public void AT() {
		System.out.println("AT");
		
	}
	@AfterClass
	public void AC() {
		System.out.println("Ac");
		
	}
	@AfterMethod
	public void AM() {
		System.out.println("AM");
		
	}
	@Test
	public void TT() {
		System.out.println("TT");
		
	}
	
	

}
