package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import swiggy.FileLibary;
import swiggy.Paths;

public class Swiggy implements Paths {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/restaurants");
		driver.findElement(By.xpath("//span[@class=\"LukWG\"]")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(10000);
          WebElement bu = driver.findElement(By.xpath("//input[@class=\"_2BJMh\"]"));
	       bu.sendKeys("Butter Chicken");
	    //   bu.sendKeys(Keys.DOWN);
	       bu.sendKeys(Keys.ENTER);
	       Thread.sleep(9000);
	       driver.findElement(By.xpath("//button[text()='Dishes']")).click();
	       Thread.sleep(9000);
	      driver.findElement(By.xpath("(//div[@class=\"_1RPOp\"])[1]")).click();
	//Point po = lo.getLocation();
	//JavascriptExecutor j = (JavascriptExecutor)driver;
	//   j.executeScript("window.scrollBy"+po);
		Thread.sleep(5000);
	//	lo.click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='LOG IN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"mobile\"]")).sendKeys("9533887089");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[@class=\"_2REYC\"]")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//a[@class=\"_2REYC\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"_2aJip\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_3dmIW _1KzVF\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_3r51H\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class=\"_1cXUn\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"_29Y5Z\"]")).click();
		Thread.sleep(2000);
	WebElement bb = driver.findElement(By.xpath("//div[@class=\"_3Y9ZP\"]"));
		    System.out.println(bb.getText());
		 String fa = bb.getText();
		    FileLibary fi= new  FileLibary();
		    if(fa.equals("Your cart is empty"))
		    {
		    	fi.writeExcelData(PROP_PATH1, "Sheet1", 1, 2, "pass");
		    }
		    else
		    {
		    	fi.writeExcelData(PROP_PATH1, "Sheet1", 1, 2, "fail");
		    }
		    

		
	}

	
	
	
	
	
	
	
	
	
	
}
