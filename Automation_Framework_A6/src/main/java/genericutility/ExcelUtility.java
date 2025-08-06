package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Manikandan
 * 
 */

public class ExcelUtility {
	/**
	 * This method will read the data from excel file and return String value to the caller
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return String
	 * @throws IOException
	 */
	
	public String getStringDataFromExcel(String sheetName, int rowIndex, int colIndex) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}
	
	/**
	 * This method will read the data from excel and return Boolean value
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return Boolean
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public boolean getBooleanDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
		
	}
	/**
	 * This method will read Number value from excel
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return number
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public double getNumberDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
	}
	/**
	 * This method will read number data and time from excel
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return date and time
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public LocalDateTime getDateAndTimeFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
		
	}

}
