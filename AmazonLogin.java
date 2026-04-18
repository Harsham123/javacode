package projects.Automationmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonLogin {
	
@Test(timeOut=5000)
	
	public void login() throws InterruptedException {
	
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	Reporter.log("Launched browser");
	Reporter.log("login to browser");
	
	Thread.sleep(2000);
	WebElement a1= driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	Actions b1= new Actions(driver);
	b1.moveToElement(a1).perform();
	
	
	WebElement h1= driver.findElement(By.id("nav-flyout-ya-signin"));
	h1.click();
	
	WebElement i1= driver.findElement(By.name("email"));
	i1.sendKeys("8792621598");		
	
	WebElement j1= driver.findElement(By.xpath("//input[@type='submit']"));
	j1.click();
	
	Thread.sleep(2000);
	
	WebElement k1= driver.findElement(By.name("password"));
	k1.sendKeys("Hars@4598");	
	
	WebElement m1= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	m1.click();
	
	Reporter.log("Test Case Pass");
	
	}
}
