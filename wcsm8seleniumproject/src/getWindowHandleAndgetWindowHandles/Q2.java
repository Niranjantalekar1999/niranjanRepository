package getWindowHandleAndgetWindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement link = driver.findElement(By.partialLinkText("Open a popup window"));
		
	    Point loc = link.getLocation();
	    int xaxis = loc.getX();
	    int yaxis = loc.getY();
	    
	    Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		Thread.sleep(2000);
		// click on link and get child window 
		link.click();
		Thread.sleep(2000);
		
		// To close ALL the browser without using quit()
		Set<String> allWindow = driver.getWindowHandles();
		
		for(String wh:allWindow)
		{
			Thread.sleep(2000);
			driver.switchTo().window(wh).close();
		}
		
		
		
		
		
		
		
	
		
		
		
		

		
		
	
	}

}
