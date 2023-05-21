package assignmennts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassAssignment {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		Actions act = new Actions(driver);
		
		act.contextClick().perform();
		
		Robot rob = new Robot();
		
		for(int i=0;i<10;i++)
		{
			Thread.sleep(2000);
			rob.keyPress(KeyEvent.VK_PAGE_DOWN);
			rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		
		  Thread.sleep(2000);
		  rob.keyPress(KeyEvent.VK_ENTER);

	}

}
