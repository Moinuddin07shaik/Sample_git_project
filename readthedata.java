package qsp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readthedata {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\NEW\\Desktop\\data.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("information");
		
		Row r1 = sh.createRow(0);
		Cell c1 = r1.createCell(0);
		c1.setCellValue("Name");
		Cell c2 = r1.createCell(1);
		c2.setCellValue("age");
		Cell c3 = r1.createCell(2);
		c3.setCellValue("section");
		
		
		Row r2 = sh.createRow(1);
		Cell c11 = r2.createCell(0);
		c11.setCellValue("moin");
		Cell c21 = r2.createCell(1);
		c21.setCellValue("10");
		Cell c31 = r2.createCell(2);
		c31.setCellValue("A");
		
		
		Row r3 = sh.createRow(2);
		Cell c12 = r3.createCell(0);
		c12.setCellValue("gun");
		Cell c22 = r3.createCell(1);
		c22.setCellValue("9");
		Cell c32 = r3.createCell(2);
		c32.setCellValue("B");
		
		
		
		Row r4 = sh.createRow(3);
		Cell c13 = r4.createCell(0);
		c13.setCellValue("bun");
		Cell c23 = r4.createCell(1);
		c23.setCellValue("11");
		Cell c33 = r4.createCell(2);
		c33.setCellValue("C");
		
		wb.write(fos);
		wb.close();
		fos.close();
	
		System.out.println("done");
		
		
		
		
		

	}

}
