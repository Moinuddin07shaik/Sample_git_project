package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "F:\\KCSM13\\Automationprj\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.co.in/");
	driver.close();

	}

}
