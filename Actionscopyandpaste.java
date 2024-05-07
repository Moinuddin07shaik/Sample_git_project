package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Actionscopyandpaste {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/qspiders11/login.do");
	     
		WebElement user =driver.findElement(By.id("username"));
		user.sendKeys("admin");
		user.sendKeys(Keys.CONTROL, "a");
		user.sendKeys(Keys.CONTROL, "c");
		Thread.sleep(2000);
		WebElement ps= driver.findElement(By.xpath("//input[@name='pwd']"));
		 ps.sendKeys(Keys.CONTROL,"v");
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.KEY_PRESSED);
		 r.keyRelease(KeyEvent.KEY_LAST);
		  Thread.sleep(2000);
		  


		

	}

}
