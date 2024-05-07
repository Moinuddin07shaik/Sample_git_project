package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rupeek {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rupeek.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("cityDisplay")).click();
		
         	 List<WebElement> uv = driver.findElements(By.xpath("//li[@class=\"city-link\"]"));
              Thread.sleep(2000);
		 
		   
		  // for(int i=0; i<=uv.size()-1;i++)
			{
	
		System.out.println(uv.size());
		
	//	for (int i=0; i<uv.size();i++) {
	//		uv.get(i).click();
	//		Thread.sleep(5000);
	//		driver.navigate().back();
		}
		
                 
	}

	}
