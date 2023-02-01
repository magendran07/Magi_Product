package Example_Topics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Generic_Program {
	public static void main(String[] args) throws Exception, IOException {
		Excel_Geneeric("Sheet1");
	}	
	public static  Object[][] Excel_Geneeric(String SheetName) throws EncryptedDocumentException, IOException {
		File file=new File("./Testdata/Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(fis);
		System.out.println(wb.getSheet(SheetName).getRow(0).getCell(0).toString());
		Sheet sheet=wb.getSheet(SheetName);
		int rowcount=sheet.getPhysicalNumberOfRows();
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		//row and colounm
		String table=sheet.getRow(0).getCell(0).getStringCellValue();
		
		Object data[][]=new Object[rowcount-1][colcount];
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();	
				}
		}
		return data; 
		
//		for(int i=0;i<rowcount;i++) {
//			for(int j=0;j<colcount;j++) {
//				System.out.println(data[i][j]+"");
//
//			}
//	}
		 
	}
}
