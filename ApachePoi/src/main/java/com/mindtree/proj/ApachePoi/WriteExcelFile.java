package com.mindtree.proj.ApachePoi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class WriteExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Emp Info");
		
		//create array of object type so it can hold homogenous data
		Object empdata[][] = {  {"EmpId","Name","Salary"},
				{101, "Joy",25000},
				{102,"Clay",30000},
				{103,"Bob",35000}	
		};
		
		//write these data in excel file
		//using forloop
		int rows = empdata.length;
		int cols = empdata[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=0;r<rows;r++) {
			
			XSSFRow row= sheet.createRow(r);
			
			for(int c=0;c<cols;c++) {
				XSSFCell cell= row.createCell(c);
				Object value = empdata[r][c];
				
				//check type of value
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		String filepath = ".\\datafiles\\employee.xlsx";
		FileOutputStream outstream = new FileOutputStream(filepath);
		workbook.write(outstream);
		
		outstream.close();
		
		System.out.println("employee.xlsx file written successfully");

	}

}
