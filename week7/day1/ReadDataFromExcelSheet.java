package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelSheet {

	public static void main(String[] args) throws IOException {

		// setup the path for excel file
		XSSFWorkbook wb = new XSSFWorkbook("data/CreateLead.xlsx");

		// Get into the sheet based index and String
		 XSSFSheet ws = wb.getSheetAt(0);

		// Get into the row
		 XSSFRow row = ws.getRow(1);
        //get the row count
		 int rowCount = ws.getLastRowNum();
		 System.out.println(rowCount);

		// Get into cell
        XSSFCell column = row.getCell(1);
		//get column count
        short columnCount = row.getLastCellNum();
        System.out.println(columnCount);
        for (int i = 0; i <=rowCount ; i++) {//2
        	for (int j = 0; j <columnCount; j++) {//4
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				 // Read the data from cell
		        
				System.out.println(cellValue);
        	}
			
		}
       
       
		// Close the file
         wb.close();
	}

}
