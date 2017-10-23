package com.testerstories.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToFeatureFile {
	private static final String FILE_NAME = "C:\\Users\\vicente.llanos\\eclipse-workspace\\cucumber_test\\login.xlsx";

	public static void main(String[] args) {

		try {
			File excel_file = new File(FILE_NAME);
			String excel_file_name = excel_file.getName();
			
			System.out.println("The file name is:" +excel_file_name);
			String[] split_name = excel_file_name.split("\\.");
			
			System.out.println("split_name[0]:" +split_name[0]);
			String featureFileName = split_name[0] +".feature";
			
			String appDirectory = System.getProperty("user.dir");
			
			String featureFileFullName = appDirectory + "\\src\\test\\resources\\"+featureFileName;
			
			FileOutputStream featureFile = new FileOutputStream(new File(featureFileFullName));
			PrintWriter writer = new PrintWriter(featureFile);
			
			FileInputStream excelFile = new FileInputStream(excel_file);
			
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = datatypeSheet.iterator();
			
			while (iterator.hasNext()) {

				Row currentRow = iterator.next();
				Iterator<Cell> cellIterator = currentRow.iterator();

				while (cellIterator.hasNext()) {

					Cell currentCell = cellIterator.next();
					//getCellTypeEnum shown as deprecated for version 3.15
					//getCellTypeEnum ill be renamed to getCellType starting from version 4.0
					if (currentCell.getCellTypeEnum() == CellType.STRING) {
						System.out.print(currentCell.getStringCellValue() + "--");
						writer.print(currentCell.getStringCellValue()+ " ");
					} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
						System.out.print(currentCell.getNumericCellValue() + "--");
						writer.print(currentCell.getStringCellValue() + " ");
					}
				}
				System.out.println();
				writer.println();
			
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
