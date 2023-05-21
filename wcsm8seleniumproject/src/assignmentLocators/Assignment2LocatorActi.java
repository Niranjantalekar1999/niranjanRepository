package assignmentLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2LocatorActi {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=bxhbubgmr21d");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginButton")).click();
		
		
		
		}

}
