package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\KCSM13\\Automationprj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfb%20login%7C&placement=&creative=589460569900&keyword=fb%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-320262102914%26loc_physical_ms%3D9062134%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMImqbWmPDs9wIVVTUrCh2nmAmtEAAYASAAEgLNJfD_BwE");
		
       // driver.get("https://www.facebook.com/?stype=lo&jlou=AfdTvEzIRaMvr7tdzXGIMrh99Me0hjnNzLu_QvDlMlqX3ND7odPI2z1Cta1BWFzUtP8rVx0n3AzXMNez8_IWjWJD9Yuynqd5w-cMSjxAELV4Sg&smuh=48111&lh=Ac_z7-1vj0H8LcH7EOI");
      //  driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        WebElement ddAddr = driver.findElement(By.id("month"));
        Select sel = new Select(ddAddr);
       // sel.selectByVisibleText("Jan");
        sel.selectByValue("9");
        List<WebElement> Allopn =sel.getOptions();
        System.out.println("size of element "+Allopn.size());
        WebElement wrapEle = sel.getWrappedElement();
        System.out.println(wrapEle.getText());
        
        	
        
        
       
	}
	

	}

		
	
		
	


