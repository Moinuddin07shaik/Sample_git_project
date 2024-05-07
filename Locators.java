package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("9533887089");
		driver.findElement(By.name("pass")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sign up ")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("123456");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("9874563210");
		driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt")).sendKeys("00012020");
		
		
		

	}
 
}
