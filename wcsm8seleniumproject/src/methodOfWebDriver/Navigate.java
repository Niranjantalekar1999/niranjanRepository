package methodOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
	    WebDriver driver=new ChromeDriver(co);
	    
	    driver.manage().window().maximize();
	    
        driver.navigate().to("https://www.google.com/");
        
        driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
        
        Thread.sleep(2000);
        
        driver.navigate().back();
        
        Thread.sleep(2000);
        
        driver.switchTo().activeElement().sendKeys("python",Keys.ENTER);
        
        Thread.sleep(4000);
        
        driver.navigate().back();
        
        Thread.sleep(2000);
        
        driver.navigate().forward();
        
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        
        Thread.sleep(2000);
        
        driver.quit();
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
