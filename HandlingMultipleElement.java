package qsp;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	
	  List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
	   System.out.println("size"+allLinks.size());
	   
	  for(int i=0; i<allLinks.size(); i++)
	   {
		   WebElement Link = allLinks.get(i);
		  String text = Link.getText();
		  System.out.println(text);
		//driver.close();
		  
		  
	   }
	   
	}

}
