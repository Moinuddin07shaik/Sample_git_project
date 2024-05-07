package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Login("9533887089","asdfghjkl@52");
	}
	public static void Login(String u,String p) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(u);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(p);

	}

}
