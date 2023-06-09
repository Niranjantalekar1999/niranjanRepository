package assignmentLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1LocatorsNetflix {

	public static void main(String[] args) throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/Login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("niranjantalekar1749@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("id_password")).sendKeys("abcd1234");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		

	}

}
