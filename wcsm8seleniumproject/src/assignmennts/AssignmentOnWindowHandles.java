package assignmennts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AssignmentOnWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung s21 fe");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String parethandle = driver.getWindowHandle();
		
		  Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S20 FE (Cloud Lavender, 128 GB)']")).click();
		
		// handle of parent and child window.
		
		Set<String> allHandle = driver.getWindowHandles();
		
		for(String wh:allHandle)
		{
			if(!parethandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		
		WebElement scrollTillThisWebElement = driver.findElement(By.xpath("//span[text()='View Details']"));
		
		Point loc = scrollTillThisWebElement.getLocation();
		int xaxis = loc.getX();
		
		int yaxis = loc.getY();
	
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='256 GB']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::ul[@class='_1q8vHb']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("416202");
		
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		
		
		
		
		
	   
		
		
		
		
	}
}
