package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src1 = driver.findElement(By.xpath("//a[@class='button button-orange' and text()=' 5000 ']"));
		
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement src3 = driver.findElement(By.xpath("//a[@class='button button-orange' and text()=' 5000 ']"));
		
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		//------------------------------------------------------------------------------------------------------------
		
		WebElement tar1 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt7']"));
		WebElement tar2 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='bank']"));
		
		WebElement tar3 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt8']"));
		WebElement tar4 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='loan']"));
		
		//------------------------------------------------------------------------------------------------------------
		
		//create object for action class
		Actions act = new Actions(driver);
		Thread.sleep(3000);
	    act.dragAndDrop(src1, tar1).perform();
	    Thread.sleep(3000);
	    act.dragAndDrop(src2, tar2).perform();
	    Thread.sleep(3000);
	    act.dragAndDrop(src3, tar3).perform();
	    Thread.sleep(3000);
		act.dragAndDrop(src4, tar4).perform();
		
	
		
		
		
		
	}

}
