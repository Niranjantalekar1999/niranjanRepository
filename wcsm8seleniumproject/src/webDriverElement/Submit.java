package webDriverElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		    
		    WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
		    driver.get("https://www.instagram.com/");
		    
		    driver.findElement(By.name("username")).sendKeys("niranajn");
		    
		    driver.findElement(By.name("password")).sendKeys("12535522");
		    
		    driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).submit();
		    
		    
		    

	}

}
