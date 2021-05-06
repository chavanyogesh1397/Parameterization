import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("E:\\Software Testing\\Selenium\\Parameterization\\AllData.xlsx");
		Sheet data = WorkbookFactory.create(file).getSheet("Employee data");
		Cell result = data.getRow(0).getCell(0);
		data.getRow(0).getLastCellNum();
		System.out.println("Print Single Row");
		//Print Single Row-----
		
		for(int i=0;i<=data.getLastRowNum();i++)
		{
			Cell loop = data.getRow(i).getCell(0);
			System.out.println(loop);
		}
		System.out.println("Print Single Column in Excel");
		//Print Single Column in Excel
		
		for(int j=0;j<=data.getRow(0).getLastCellNum();j++)
		{
			Cell loop1 = data.getRow(0).getCell(j);
			System.out.print(loop1+" ");
		}
		//Print All Data in Excel
		System.out.println("Print All Data in Excel");
		for(int k=0;k<=data.getLastRowNum();k++)
		{
			for(int m=0;m<=data.getRow(0).getLastCellNum()-1;m++)
			{
				Cell xy = data.getRow(k).getCell(m);
				System.out.print(xy+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
