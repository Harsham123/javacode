package projects.Automationmaven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazonloginwithforloopmultipleinput {

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
		driver.close();
	}
	
	@DataProvider
		public Object[][] logindetails() throws EncryptedDocumentException, IOException  {

	    Object[][] s1 = new Object[3][2];
	    
	    FileInputStream fs = new FileInputStream("C:\\Users\\Lenovo-PC\\eclipse-workspace\\Automationmaven\\target\\Excel Sheet\\harsha.xlsx");
        

	    Workbook wb = WorkbookFactory.create(fs);

	    for(int i=0; i<3; i++) {
	    	
	    	for(int j=0; j<2; j++) {
	    		
	    	
	    		s1[i][j] = wb.getSheet("login").getRow(i+1).getCell(j).getStringCellValue();
	    		
	    	
	    		    		 
	    }
	    	
	    }

	    return s1;
	}
		

}
