import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	private static final char[] Cell = null;

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("E:\\Software Testing\\Selenium\\Parameterization\\parameterizationExc.xlsx");
//		double data = WorkbookFactory.create(file).getSheet("functional Teasting").getRow(0).getCell(1).getNumericCellValue();
//		System.out.println(data);
		Sheet file1 = WorkbookFactory.create(file).getSheet("functional Teasting");
//		System.out.println(file1.getRow(0).getCell(0).getStringCellValue()+" "+file1.getRow(0).getCell(1).getNumericCellValue());
//		System.out.println(file1.getRow(1).getCell(0)+" "+file1.getRow(1).getCell(1));
//		System.out.println(file1.getRow(2).getCell(0)+" "+file1.getRow(2).getCell(1));
		//System.out.println(file1.getRow(3).getCell(0)+" "+file1.getRow(3).getCell(1));
		ArrayList Name = new ArrayList();
		ArrayList marks = new ArrayList();
		for(int i=0;i<=21;i++)
		{
			try {Name.add(file1.getRow(i).getCell(0));}
			catch(Exception e)
			{
				
			}
			
		}
		for(int j=0;j<=21;j++)
		{
			try 
			{
				marks.add(file1.getRow(j).getCell(1));
			}
			catch(Exception e)
			{
				
			}
			
		}
//		System.out.println(Name);
//		System.out.print(marks);
//		
		for(int k=0;k<=21;k++)
		{
			try
			{
			System.out.print(Name.get(k)+" "+ marks.get(k));
			System.out.println();
			}
			catch(Exception e)
			{
				
			}
		}
	}	
}
	
