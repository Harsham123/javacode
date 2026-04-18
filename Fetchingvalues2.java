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

public class Fetchingvalues2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fs= new FileInputStream ("C:\\Users\\Lenovo-PC\\eclipse-workspace\\Automationmaven\\target\\Excel Sheet\\harsha.xlsx");
		
		Workbook wb=		WorkbookFactory.create(fs);
		
	String username=	wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
	String password=	wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
	
	 System.out.println(username);
	 System.out.println(password);
	 
	 ChromeDriver d1= new ChromeDriver();
		d1.get("https:www.amazon.in");
		Thread.sleep(2000);
		
		d1.manage().window().maximize();
		
	//	WebElement a1= d1.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		WebElement a1= d1.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions b1= new Actions(d1);
		b1.moveToElement(a1).perform();
		
		
		WebElement h1= d1.findElement(By.id("nav-flyout-ya-signin"));
		h1.click();
		
		WebElement i1= d1.findElement(By.name("email"));
		i1.sendKeys(username);		
		
		WebElement j1= d1.findElement(By.xpath("//input[@type='submit']"));
		j1.click();
		
		Thread.sleep(3000);
		
		WebElement k1= d1.findElement(By.name("password"));
		k1.sendKeys(password);	
		
		WebElement m1= d1.findElement(By.xpath("//input[@id='signInSubmit']"));
		m1.click();
		
	

	}

}
