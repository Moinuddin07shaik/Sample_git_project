package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNotificationpopup {

	public static void main(String[] args) throws InterruptedException {
		// Handling browser notification popup
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
	ChromeOptions co	= new  ChromeOptions();
	co.addArguments("--disable-notification");
	co.addArguments("start-maximized");
	WebDriver driver =new ChromeDriver(co);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.get("https://www.hdfc.com/");
	

	}

}
