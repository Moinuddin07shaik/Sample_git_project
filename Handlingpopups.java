package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpopups {

	public static void main(String[] args) throws InterruptedException {
		// Alert popup
//		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("file:///C:/Users/NEW/Desktop/case-5/confirm.html");
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		Alert b=driver.switchTo().alert();
//		System.out.println(b.getText());
		//b.accept();
		
		// confirm popup
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
   	driver.manage().window().maximize();
		driver.get("file:///C:/Users/NEW/Desktop/case-5/confirm.html");
		driver.findElement(By.xpath("//button[text()='I love you']")).click();
		Thread.sleep(2000);
		Alert b=driver.switchTo().alert();
          	System.out.println(b.getText());
          //	b.accept();
          	b.dismiss();
          	}

}
