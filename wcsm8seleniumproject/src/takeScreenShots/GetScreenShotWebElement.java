package takeScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class GetScreenShotWebElement {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		
		WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		if(button.isEnabled())
		{
			System.out.println("we cann do login");
			
		}
		else
		{
			System.out.println("we can not do login!! ss is taken");
			File src= button.getScreenshotAs(OutputType.FILE);
			File dest= new File("./ScreenShots/we1.jpg");
			Files.copy(src,dest);
		}
	}

}
