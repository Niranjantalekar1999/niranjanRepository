package assignmentLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndia {

	public static void main(String[] args) throws InterruptedException {
        
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.airindia.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Pune, Lohegaon Airport, PNQ, India, IN']")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Delhi");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Delhi, Indira Gandhi International Airport, DEL, India, IN']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='_depdateeu1']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and text()='2']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='_retdateeu1']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and text()='30']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='ddladult1']")).sendKeys("4");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='concessionaryType1']")).sendKeys("Armed Forces");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='_classType1']")).sendKeys("Economy");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnbooking")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
