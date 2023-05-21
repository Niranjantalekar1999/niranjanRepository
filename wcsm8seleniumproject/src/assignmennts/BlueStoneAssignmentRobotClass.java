package assignmennts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneAssignmentRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		driver.findElement(By.xpath("//a[@title='Watch Jewellery']")).click();
		
		WebElement target = driver.findElement(By.xpath("//div[text()='Filter by']"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		   for(int i=0;i<=2;i++)
		{
			act.clickAndHold(target).perform();
		}
		
		       Robot robot = new Robot();
		       robot.keyPress(KeyEvent.VK_CONTROL);
		       robot.keyPress(KeyEvent.VK_C);
		      
		       robot.keyRelease(KeyEvent.VK_C);
		       robot.keyRelease(KeyEvent.VK_CONTROL);
		       
		       
		       driver.findElement(By.name("search_query")).click();
		       robot.keyPress(KeyEvent.VK_CONTROL);
		       robot.keyPress(KeyEvent.VK_V);
		       
		       robot.keyRelease(KeyEvent.VK_V);
		       robot.keyRelease(KeyEvent.VK_CONTROL);
		       
		       
		       driver.findElement(By.name("submit_search")).submit();
		       
		       
		
		
		
	
	}

}
