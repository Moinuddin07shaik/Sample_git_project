package qsp;

import java.util.List;

import org.apache.poi.ss.formula.functions.Rows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rowsandcloumns {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.moneycontrol.com/stocks/marketstats/nsegainer/index.php");
		Thread.sleep(2000);
	   List<WebElement> rows = driver.findElements(By.tagName("tr"));
	   int count=0;
	   for(int i=1;rows.size()<=i;i++) {
		   count=count++;
	   }
	   System.out.println(count);
	 //  System.out.println("no of rows:"+rows.size());
	  
	   
	  // List<WebElement> columns = driver.findElements(By.xpath("//td[@class=\"PR\"]"));
	   
	  // System.out.println("no of columns:"+columns.size());
	}

}
