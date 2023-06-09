package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(co);
			
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/Mr%20vijay%20patil/Desktop/html/link.html");
			
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("FlipkartLink")).click();
			
			
			
	}

}
