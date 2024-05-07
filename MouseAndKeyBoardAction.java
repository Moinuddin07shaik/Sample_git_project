package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyBoardAction {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// performing mouse hover actions
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		WebElement hom =driver.findElement(By.xpath("//div[text()='Home']"));
//		
//		Actions ac=new Actions(driver);
//		ac.moveToElement(hom).perform();

		
		//performing doubleclick actions
//		driver.get("https://www.google.com/");
//		WebElement seacher =driver.findElement(By.name("q"));
//		seacher.sendKeys("qspiders");
//		
//	Actions	ac=new Actions(driver);
//	ac.doubleClick(seacher).perform();
//	
	
	// performing right click and handle right clicked options
	driver.get("https://online.actitime.com/qspiders11/login.do");
	WebElement link =driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
	Actions ac=new Actions(driver);
	ac.contextClick(link).perform();
	Thread.sleep(2000);
	   
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
		
		

		

	}

}
