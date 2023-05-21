package assignmennts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@alt='Noise ColorFit Pulse Spo2 Smart Watch']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("500698");
		
        waitMethod(driver,30,"Check").click();
		
	}
	
	   public static WebElement waitMethod(WebDriver driver,int sec,String value)
	   {
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(value)));
           return element;
	   }
	
	

	
}
