package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 Scanner sc = new Scanner(System.in);
         System.out.println("Select the browser which want you launch!!!");
         String browserValue=sc.next();
         
         if(browserValue.equalsIgnoreCase("Chrome"))
         {
        	 System.setProperty("webdriver,chrome.driver","./driver/chromedriver.exe");
        	 ChromeOptions co = new ChromeOptions();
        	 co.addArguments("--remote-allow-origins=*");
        	 driver=new ChromeDriver(co);
        	 driver.manage().window().maximize();
        	 Thread.sleep(2000);
        	 driver.close();
        	 
         }
         else if(browserValue.equalsIgnoreCase("Firefox"))
         {
        	 driver=new FirefoxDriver();
        	 driver.manage().window().maximize();
        	 Thread.sleep(2000);
        	 driver.close();
        	 
         }
         else
         {
        	 System.out.println("Enter the valid browser name");
         }
	}

}
