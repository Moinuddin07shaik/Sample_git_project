package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class notepad {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	 FileInputStream fis = new FileInputStream("F:\\KCSM13\\Automationprj\\data\\moin.properties");
	Properties prop = new Properties();
	prop.load(fis);
	       String propValue = prop.getProperty("url", "incorrect key");
	
	System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(propValue);
	
	Thread.sleep(2000);
	                    String propvalue1 = prop.getProperty("username", "incorrect key");

	}

}
