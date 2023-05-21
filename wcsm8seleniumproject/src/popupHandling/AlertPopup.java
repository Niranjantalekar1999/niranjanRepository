package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Mr%20vijay%20patil/Desktop/Niranjan%20Talekar%201/html/AlertPopup.html");
		
		
		driver.findElement(By.xpath("//button[.='Click me!']")).click();
		
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		
		al.accept();
		
	

	}

}
