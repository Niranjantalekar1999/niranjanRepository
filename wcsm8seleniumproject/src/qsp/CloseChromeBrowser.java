package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Close Chrome Browser
		// To avoid IllegalStateException
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				
				//to avoid connection faild Exception
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
			
		         
		ChromeDriver driver= new ChromeDriver(co);
		

		Thread.sleep(2000);
		
		driver.close();
	}

}
