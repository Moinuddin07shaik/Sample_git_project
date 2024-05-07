package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	public static void main(String[] args) throws Throwable {
//	 file = new FileInputStream("C:\\Users\\NEW\\Desktop\\excel.xlsx");        
//
//		XSSFWorkbook workbook = new XSSFWorkbook(file); 
//		System.out.println(workbook.getSheet("Sheet1").getLastRowNum()+1);
//					FileInputStream
//	     
		  JFileChooser f = new JFileChooser();
	        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
	        f.showSaveDialog(null);

	        System.out.println(f.getCurrentDirectory());
	        System.out.println(f.getSelectedFile());
	
	}
		
	}

