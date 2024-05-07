package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDDD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement ddAddr = driver.findElement(By.name("q"));
		ddAddr.sendKeys("qspiders hyderabad");
	
		//driver.findElement(By.xpath("//b[text()=' kphp reviews']")).click();
//		ddAddr.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.ENTER);
       
		

	}

}
