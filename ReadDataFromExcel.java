package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
        FileInputStream fis =new FileInputStream("C:\\Users\\NEW\\Desktop\\book.xlsx");
   Workbook   wb = WorkbookFactory.create(fis);
     Sheet sh = wb.getSheet("sheet1");
     Row r= sh.getRow(3);
     Cell c =r.getCell(0);
     String xlval = c.getStringCellValue();
   System.out.println(xlval);
   if(xlval.equals("chrome"))
   {
	  System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	WebElement    addr =driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
	addr.sendKeys("innovacx");
	addr.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//cite[text()='https://www.innovacx.com']")).click();
	Actions ac =new Actions(driver);
     WebElement	web =driver.findElement(By.xpath("//a[@href=\"cloud.html\"]"));
	ac.moveToElement(web).perform();
        java.util.List<WebElement>	bnm = driver.findElements(By.xpath("//a[@class='cus_nav trigger']"));
	
	for(int i=0; i<=bnm.size()-1;i++)
			{
		System.out.println(bnm.get(i).getText());
			}
   }
     

}
}