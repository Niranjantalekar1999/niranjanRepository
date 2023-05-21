package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElemet {

	public static void main(String[] args) {
	
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
	    WebDriver driver=new ChromeDriver(co);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("http://desktop-4rv143a/login.do");
	    
        WebElement usernameTextBox = driver.findElement(By.name("username"));
		
		usernameTextBox.sendKeys("admin");
		
		System.out.println(usernameTextBox);
	    
	    
	}

}
