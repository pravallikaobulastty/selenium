package com.swaglabs.utils;

import java.io.FileInputStream;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadTestData {
	XSSFSheet sheet;
	public ReadTestData(String filename)
	{
		try
		{
		String filepath=".//testdata//"+ filename+".xlsx"; //--->filepath(loaction)
		FileInputStream instream= new FileInputStream(filepath); //---> reading
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		 sheet = workbook.getSheet("Sheet1");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
		public String getdata(int row, int column)
		{
			return sheet.getRow(row).getCell(column).getStringCellValue();
		}
		public List<String> getdata(int row)
		{	
			List<String> rowdata=new ArrayList<String>();
			int cellscount=sheet.getRow(row).getLastCellNum();
			for(int i=0; i<cellscount;i++)
			{
				String data= sheet.getRow(row).getCell(i).getStringCellValue();
				rowdata.add(data);

			}
			return rowdata;
		}	
			public String[][] getdata()
			{	
				int rows=sheet.getLastRowNum();
				int Ccount=sheet.getRow(0).getLastCellNum();
				String info[][] = new String[rows][Ccount];
				int k=0,l=0;
				for(int i=0;i<=rows;i++)
				{
					for(int j=0;j<Ccount;j++)
					{
					String data = sheet.getRow(i).getCell(j).getStringCellValue();
					 info[k][l]=data;
					}
					 k++;
					 l=0;
					 
				}
				return info;
				
				}
			
		}
		
		
	
		


