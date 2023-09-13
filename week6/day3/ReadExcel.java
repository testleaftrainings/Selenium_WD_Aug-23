package week6.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		//set up the path for excel
		XSSFWorkbook wb =new XSSFWorkbook("./data/"+fileName+".xlsx");
		//Get into the sheet based index or String
		XSSFSheet ws = wb.getSheetAt(0);
		//Get the rowCount
		int rowCount = ws.getLastRowNum();
		//Get the columnCount
		short columnCount = ws.getRow(0).getLastCellNum();
		//string [] []
		 String[][] data =new String[rowCount][columnCount];
		
		for (int i = 1; i <= rowCount; i++) {
			//Get into the row
			     XSSFRow row = ws.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {
				//Get into the column using row 
		          XSSFCell cell = row.getCell(j);
			
		//Read the data from cell
		String cellValue = cell.getStringCellValue();
		
		data[i-1][j]=cellValue;//[0][0]
		
		
		//print the cell value in console
		System.out.println(cellValue);
			}
		}
		
		//close the wb 
		wb.close();		
		return data;
		
		
	}

}
