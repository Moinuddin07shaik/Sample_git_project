package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown_scrrollup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[text()='✕']")).click();

		//scroll down
		JavascriptExecutor j = (JavascriptExecutor)driver;
   j.executeScript("window.scrollBy(0,600)");
	Thread.sleep(3000);
	// scroll up
	Thread.sleep(3000);
	j.executeScript("window.scrollBy(0,-600)");
	driver.close();
	

	}

}
