package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDeselectSingleSelectDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       driver.get("file:///C:/Users/Mr%20vijay%20patil/Desktop/Niranjan%20Talekar%201/html/single%20select%20Dropdown.html");
       
       WebElement dropdown = driver.findElement(By.name("menu"));
       
       Select sel = new Select(dropdown);
       
       Thread.sleep(2000);
       
       sel.selectByIndex(4);
       
       Thread.sleep(2000);
       
       sel.deselectByIndex(4);
       
       
	}

}
