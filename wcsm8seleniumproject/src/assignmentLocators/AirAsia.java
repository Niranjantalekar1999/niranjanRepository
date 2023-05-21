package assignmentLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirAsia {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(co);
			
			driver.manage().window().maximize();
			
			driver.get("https://www.airindiaexpress.in/home?&keyword_source=Bt_AirAsia_Search_Brand&utm_medium=bt_cpc&utm_campaign=Bt_AirAsia_Search_Brand&utm_term=Airasia&utm_content=154594440944&utm_device=c&gclid=CjwKCAjw586hBhBrEiwAQYEnHcKSPopFuFmnTwfybps6rIvLvd7cEUvaoPMy3BYCxoUGd2R8wkRF7BoCjacQAvD_BwE&gclsrc=aw.ds");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@class='flight-search-source-field-text flight-search-polygon-cut-from']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[text()='Indira Gandhi International Airport']")).click();
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//div[@class='flight-search-source-code' and text()='Fly to']")).click();
			
			Thread.sleep(6000);
			
			driver.findElement(By.xpath("//button[@id='list-item'  and @class='arrival-dropdown-list-group-item list-group-item list-group-item-action'][1]")).click();
			
			
			
			
			
			
		
			

	}

}
