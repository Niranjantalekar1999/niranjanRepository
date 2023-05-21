package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssLocator {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("absjdjjferg");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("12555545525");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
		
		
		
		
	}

}
