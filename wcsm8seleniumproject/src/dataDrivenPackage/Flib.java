package dataDrivenPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//it is use to store Generic Reusable Methods
	//all methods are non static

	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet(sheetName);
	    Row row = sheet.getRow(rowCount);
	    Cell cell = row.getCell(cellCount);
	    String data = cell.getStringCellValue();
	    return data;
	}
	
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
    {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	 }
	
	public void writeExcelData(String excelPath,String sheetName,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(1);
		Cell cell = row.createCell(2);
		cell.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}
    
}

     
