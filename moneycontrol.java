package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moneycontrol {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/");
		Thread.sleep(2000);
		Actions bc =new Actions(driver);
	     WebElement	web =driver.findElement(By.xpath("//div[@class=\"main_header_wrapper navmenu clearfix PR\"]/descendant::a[@title=\"Markets\"]"));
        bc.moveToElement(web).perform();
        Thread.sleep(2000);
     driver.findElement(By.xpath("(//a[@title=\"Top Gainers\"])[1]")).click();
     Thread.sleep(2000);
     java.util.List<WebElement> 	uvw =driver.findElements(By.xpath("//div[@class=\"bsr_table hist_tbl_hm\"]"));

		for(int i=0; i<=uvw.size()-1;i++)
				{
		
			System.out.println(uvw.get(i).getText());
			

			
				}


	}

}
