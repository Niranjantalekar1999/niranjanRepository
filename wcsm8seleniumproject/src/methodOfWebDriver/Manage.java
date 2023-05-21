package methodOfWebDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Manage {

	public static void main(String[] args) throws InterruptedException {

	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
				
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	   Dimension targetSize = new Dimension(350, 500);
	   
	   Thread.sleep(2000);
	   driver.manage().window().setSize(targetSize);
	   
	   Thread.sleep(2000);
	   
	   Point targetPosition = new Point(500,300);
	   
	   Thread.sleep(2000);
	   
	   driver.manage().window().setPosition(targetPosition);
	   
	   Thread.sleep(2000);
	   
	   driver.close();
	   
	   
	   
	   
	   
	   
	   
	  
	}

}
