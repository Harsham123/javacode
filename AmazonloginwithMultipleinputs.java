package projects.Automationmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonloginwithMultipleinputs {
	
	@Test(dataProvider="logindetails")
	public void login(String username, String Password) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement a1= driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions b1= new Actions(driver);
		b1.moveToElement(a1).perform();
		
		
		WebElement h1= driver.findElement(By.id("nav-flyout-ya-signin"));
		h1.click();
		
		WebElement i1= driver.findElement(By.name("email"));
		i1.sendKeys(username);		
		
		WebElement j1= driver.findElement(By.xpath("//input[@type='submit']"));
		j1.click();
		
		WebElement k1= driver.findElement(By.name("password"));
		k1.sendKeys(Password);	
		
		WebElement m1= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		m1.click();
	}
	
	@DataProvider
	public Object logindetails() {
		
		Object s1[][]= new Object[3][2];
		s1[0][0]="Test@gmail.com";
		s1[0][1]="1234";
		
		s1[1][0]="8793621596";
		s1[1][1]="1234";
		
		s1[2][0]="harsha@gmail.com";
		s1[2][1]="asdfg";
		
		return s1;
		
	}
	
	
	
	
	

}
