package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LaunchChromeBrowser1 {

	public static void main(String[] args) {
		// To avoid IllegalStateException
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		//to avoid connection faild Exception
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	
         new ChromeDriver(co);
	}

}
