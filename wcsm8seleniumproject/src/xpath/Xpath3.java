package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath3 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP laptop");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i7']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Brand']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Operating System']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
		
		Thread.sleep(2000);
		
		String priceOfLaptop = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[5]")).getText();
		
		Thread.sleep(2000);
		
		System.out.println(priceOfLaptop);
		
		driver.quit();
		
		
	}

}
