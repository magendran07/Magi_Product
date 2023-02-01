package Example_Topics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WorkBook  {
	@Test
	
	public static void name() throws EncryptedDocumentException, IOException {
		
		File file=new File("./Testdata/Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook  workbook=WorkbookFactory.create(fis);
		
		System.out.println(workbook.getSheet("Sheet1").getRow(1).getCell(1).toString());
		
		
	}
}