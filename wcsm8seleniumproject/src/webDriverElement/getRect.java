package webDriverElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-4rv143a/login.do");
	    
	    WebElement button = driver.findElement(By.id("loginButton"));
	    
	    Rectangle rect = button.getRect();
	    
	    //get loc of web element
	    
	    int xaxis = rect.getX();
	    int yaxis = rect.getY();
	    
	    System.out.println(" x axis :"+xaxis+"  y axis :"+yaxis);
	    
	    //get Hight of web element
	    
	    int h = rect.getHeight();
	    int w = rect.getWidth();
	    
	    System.out.println("Hight :"+h+"  Width :"+w);
	    
	    

	    

	}

}
