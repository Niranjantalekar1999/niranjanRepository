package assignmentLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment3Facebook {

	public static void main(String[] args) throws InterruptedException {
	

        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("qwertyuiioopppfrthr");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys("abcd1234");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		
		
		
		
	}

}
