package assignmentLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/online-booking/tsrtc?gclid=Cj0KCQjw_r6hBhDdARIsAMIDhV9-cKTwKnZxjWaWjKFWYAdxq96DVsJYwB-j3EVbLFNDwJvZb8BQ_QYaAgFYEALw_wcB");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='FROM']")).sendKeys("pune");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Shivaji Nagar, Pune']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='TO']")).sendKeys("Bangalore");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Anand Rao Circle, Bangalore']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtOnwardCalendar")).click();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	}

}
