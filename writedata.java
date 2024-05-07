package qsp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class writedata {

	public static void main(String[] args) throws Throwable {
	File file=new File("C:\\Users\\NEW\\Desktop\\book.xlsx");
	 XSSFWorkbook wb =new XSSFWorkbook();
     XSSFSheet sh=wb.createSheet("inputdata");
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.moneycontrol.com/stocks/marketstats/nsegainer/index.php");
		Thread.sleep(2000);
	WebElement table=	driver.findElement(By.xpath("//div[@class=\"bsr_table hist_tbl_hm\"]"));
	Thread.sleep(2000);
	java.util.List<WebElement> totalRows=   table.findElements(By.tagName("tr"));
//	System.out.println("no.of rows:"+totalRows);
	for(int row=0;row<totalRows.size();row++)
	{
		XSSFRow rowvalue=sh.createRow(row);
		java.util.List<WebElement> totalcolumns =totalRows.get(row).findElements(By.tagName("td"));
		//System.out.println("no.of column:"+totalcolumns);
		for(int col=0;col<totalcolumns.size();col++) {
			String cellvalue =totalcolumns.get(col).getText();
			if(!cellvalue.equals(null)) 
			System.out.print(cellvalue+"\t");
			rowvalue.createCell(col).setCellValue(cellvalue);
		}
		
		
			
		
		
		System.out.println();
		FileOutputStream fos=new FileOutputStream(file);
			wb.write(fos);
	
	}
		}
		
	}
	

