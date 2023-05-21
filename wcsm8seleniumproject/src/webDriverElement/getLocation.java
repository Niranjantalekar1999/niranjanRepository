package webDriverElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://desktop-4rv143a/login.do");
    
    WebElement button = driver.findElement(By.id("loginButton"));
    
    Point loc = button.getLocation();
    
    int xaxis = loc.getX();
    int yaxis = loc.getY();
    
    System.out.println(" x axis :"+xaxis+"  y axis :"+yaxis);


}
}
