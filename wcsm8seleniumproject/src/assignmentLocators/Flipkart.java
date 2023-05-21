package assignmentLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(co);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.flipkart.com/");
			
			
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP laptop");
			
			
			
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			
		
			
			driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i7']")).click();
			
		
			
			driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Brand']")).click();
			
			
			
			driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
			
		
			
			driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Operating System']")).click();
			
	
			
			driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
			
			
			
			driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
			
			
		}

}
