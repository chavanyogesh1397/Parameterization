import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllDatatypeData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("E:\\Software Testing\\Selenium\\Parameterization\\AllDatatype.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		CellType celltype = sheet.getRow(1).getCell(2).getCellType();
	
		if(celltype==CellType.STRING)
		{
			System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
		}
		else if(celltype==CellType.NUMERIC)
		{
			System.out.println(sheet.getRow(1).getCell(2).getNumericCellValue());
		}
		else if(celltype==celltype.BOOLEAN)
		{
			System.out.println(sheet.getRow(1).getCell(2).getBooleanCellValue());
		}
	}
}
