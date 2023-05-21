package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdLocatorFB {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569849%7Cb%7Cfacebook%20%27%7C&placement=&creative=589460569849&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw5pShBhB_EiwAvmnNV70jLRtlyBxbi3x3GHGJkC39qLRliM1-2W9Q8XcrLlOta5fFxc_9OxoCDnsQAvD_BwE");
		
		Thread.sleep(2000);
		
	    driver.findElement(By.id("year")).click();
		
		
	}

}
