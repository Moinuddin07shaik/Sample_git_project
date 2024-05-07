package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class login_logout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9533887089");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Moin@7089");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("Moblies");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(2000);
	WebElement	my =driver.findElement(By.xpath("//div[@class=\"exehdJ\"]"));
	Actions ac=new Actions(driver);
	ac.moveToElement(my).perform();
	Thread.sleep(2000);
     List<WebElement>  allops =driver.findElements(By.xpath("//div[@class=\"exehdJ\"]"));
     System.out.println(allops.size());
     
	


	}

}
