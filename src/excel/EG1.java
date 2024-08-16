package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EG1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myFile= new FileInputStream("C:\\Users\\iamra\\OneDrive\\Desktop\\excelTest.xlsx");
		
		//String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		//System.out.println(value);
		
boolean value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();

System.out.println(value);
	}

}
  