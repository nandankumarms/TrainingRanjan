package TestNGBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./TestData/ReadData.xlsx");
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet sheet=workbook.getSheet("Login");
		
		int rowCount=sheet.getPhysicalNumberOfRows();//5
	    int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();//2
		
	    String[][] data=new String[rowCount-1][cellCount];//5 2
	    
	    for(int j=1;j<rowCount;j++) {
	    for(int i=0;i<cellCount;i++) {
	    	
	    	data[j][i]=sheet.getRow(j).getCell(i).toString();
	    	System.out.print( data[j][i]);
	    }
	    System.out.println();
	    }
		
		
	}

}
