package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameTweetLocator {

	public static void main(String[] args) throws InterruptedException {
	   
		    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
			ChromeOptions co = new ChromeOptions();
			
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(co);
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
			
			Thread.sleep(2000);
			
			driver.findElement(By.tagName("input")).sendKeys("Niranjan");
			
	}

}
