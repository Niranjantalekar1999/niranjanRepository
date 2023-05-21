package webDriverElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
			
		    WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
		    driver.get("http://desktop-4rv143a/login.do");
		    
		    WebElement cheakBox = driver.findElement(By.name("remember"));
		    
		    boolean verify = cheakBox.isSelected();
		    
		    System.out.println(verify);
		    
		    cheakBox.click();
		    
		    boolean verify2 = cheakBox.isSelected();
		    
		    System.out.println(verify2);
		    
	}

}
