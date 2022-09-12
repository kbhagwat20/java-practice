package com.mindtree.proj.ApachePoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// get location of the file
		String excelFilePath = ".\\datafiles\\Employee Table.xlsx";
		
		//for file open in reading mode
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		
		//get workbook from file
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		
		//from workbook we get the sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//Using for loop to read the sheet
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<rows; r++)
		{
			//get the row
			XSSFRow row = sheet.getRow(r);
			
			for(int c=0; c<cols; c++) 
			{
				XSSFCell cell = row.getCell(c);
				
				//check cell type
				switch(cell.getCellType()) 
				{
				case STRING: System.out.print(cell.getStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
				}
				System.out.print("  ");
			}
			System.out.println(" ");
			
		}
		System.out.println();
		

	}

}
