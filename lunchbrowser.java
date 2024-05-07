package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lunchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		System.out.println("Enter browser name");
		Scanner sc = new Scanner(System.in);
		String brName = sc.next();
		if(brName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(brName.equals("firefox")) {
			System.setProperty("Webdriver.gecko.driver","F:\\KCSM13\\Automationprj\\Driver\\geckodriver.exe" );
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("reyy dabba fellow enter correct brname");
		}
		driver.close();
			
		}
			

	}


