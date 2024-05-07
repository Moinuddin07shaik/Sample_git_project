package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filpkart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement hom =driver.findElement(By.xpath("//div[text()='Home']"));
	
		Actions ac=new Actions(driver);
	ac.moveToElement(hom).perform();
	Thread.sleep(2000);
  WebElement kit = driver.findElement(By.xpath("//a[text()='Kitchen & Dining']"));
  Actions bc = new Actions(driver);
  bc.moveToElement(kit).perform();
    List<WebElement> items = driver.findElements(By.xpath("//a[@class='_6WOcW9 _3YpNQe']"));
     
        for(int i=2;i<=items.size()-1;i++)
	{
        System.out.println(items.get(i).getText());

       String f = items.get(i).getText();
       if(f.equals("Bakeware"))
    		   {
    	   System.out.println("present");
    	   
    		   }
//         TreeSet<String> s1 = new TreeSet<>();
//         
//		String l = null;
//		for(int j=2;j<=items.size()-1;j++)
//           l= items.get(j).getText();
//         s1.add(l);
//         System.out.println(s1);
//         
         {
//        	System.out.println(s1);
         }
}
         }

}
