package projects.Automationmaven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchingvalues {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		FileInputStream fs= new FileInputStream ("C:\\Users\\Lenovo-PC\\eclipse-workspace\\Automationmaven\\target\\Excel Sheet\\harsha.xlsx");
				
		Workbook wb=		WorkbookFactory.create(fs);
		
	/*	 Sheet s1= wb.getSheet("login");
		 
		Row r1= s1.getRow(0);
		
		Cell c1= r1.getCell(0);
		
		 String value =c1.getStringCellValue();
		 
		 System.out.println(value);
		*/
		
		
	String value=	wb.getSheet("Login").getRow(2).getCell(1).getStringCellValue();		
	
	 System.out.println(value);
		 
		
		
		
		
		
		

	}
}
