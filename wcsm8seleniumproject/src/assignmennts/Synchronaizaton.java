package assignmennts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronaizaton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("niranjan");
		driver.findElement(By.name("password")).sendKeys("niru1234");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
	}

}
