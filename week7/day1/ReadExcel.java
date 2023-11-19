package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		// setup the path for excel file
		XSSFWorkbook wb = new XSSFWorkbook("data/"+fileName+".xlsx");
		// Get into the sheet based index and String
		XSSFSheet ws = wb.getSheetAt(0);
		// Get row count
		int rowCount = ws.getLastRowNum();
		// get column count
		short columnCount = ws.getRow(0).getLastCellNum();
		
		String[][] data =new String[rowCount][columnCount];
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				// Read the data from cell
				System.out.println(cellValue);
				data[i-1][j]=cellValue;//[0] [0] 
				
			}

		}
		wb.close();
       return  data;
	}
}
