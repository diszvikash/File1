package com.Klu.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author vikash
 *
 */
public class Filelib 
{
	/**
	 * This generic reusable method is used to read the data from property file
	 * @param propPath
	 * @param key
	 * @return propValue
	 * @throws Throwable
	 */
	public String readPropertyData(String propPath, String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String propValue = prop.getProperty(key,"Incorrect Key");
		return propValue;	
	}
	
	/**
	 * This generic method is used to read the date from the excel file.
	 * @param path
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return excelValue
	 * @throws Throwable
	 */
     public String readExcelData(String path, String sheetName, int row, int cell) throws Throwable
     {
    	FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		String excelValue=wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
    	return excelValue;
     }
     
     /**
      * This generic method is used to write the data in the excel file.
      * @param path
      * @param sheetName
      * @param row
      * @param cell
      * @param data
      * @throws Throwable
      */
	public void writeExcelData(String path, String sheetName, int row, int cell, String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		wb.createSheet(sheetName).getRow(row).createCell(cell).setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
	}
	
	/**
	 * This generic reusable method is used to count the total rows filled in an excel file 
	 * @param path
	 * @param sheet
	 * @return rowCount
	 * @throws Throwable
	 */
	public int getRowCount(String path, String sheet) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		int rowCount=wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
	
		

	

}
