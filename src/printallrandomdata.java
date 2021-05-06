import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printallrandomdata 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("E:\\Software Testing\\Selenium\\Parameterization\\AllDatatype.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			for(int j=0;j<=sheet.getRow(i).getLastCellNum()-1;j++)
			{
				CellType cellinfo = sheet.getRow(i).getCell(j).getCellType();
				if(cellinfo==CellType.NUMERIC)
				{
					System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue()+" ");
				}
				else if(cellinfo==CellType.STRING)
				{
					System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
				}
				else if(cellinfo==CellType.BOOLEAN)
				{
					System.out.print(sheet.getRow(i).getCell(j).getBooleanCellValue()+" ");
				}
			}
			System.out.println();
		}
	}
}
