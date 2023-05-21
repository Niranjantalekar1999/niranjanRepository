package webDriverElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://www.instagram.com/");
        
        WebElement userTB = driver.findElement(By.name("username"));
        WebElement passTB = driver.findElement(By.name("password"));
        WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
        
        if(userTB.isDisplayed())
        {
        	userTB.sendKeys("niranjantalekar");
        }
        else
        {
        	System.out.println("will get Exception");
        }
        
        if(passTB.isDisplayed())
        {
        	passTB.sendKeys("12354444");
        }
        else
        {
        	System.out.println("will get Exception");
        }
        if(button.isDisplayed())
        {
        	button.click();
        }
        else
        {
        	System.out.println("will get Exception");
        }
	}

}
