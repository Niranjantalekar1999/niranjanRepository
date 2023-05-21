package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       driver.get("file:///C:/Users/Mr%20vijay%20patil/Desktop/Niranjan%20Talekar%201/html/multi%20select%20dropdown.html");
       
       WebElement dropdown = driver.findElement(By.name("menu"));
       
       Select sel = new Select(dropdown);
       
       for(int i=0;i<8;i++)
       {
    	   if(i%2==0)
    	   {
    		   Thread.sleep(3000);
    		   sel.selectByIndex(i);
    		   
    	   }
    	   else
    	   {
    		   System.out.println("its odd place");
    	   }
       }
             Thread.sleep(3000);
             //deselect the option
             for(int i=0;i<8;i++)
             {
            	 Thread.sleep(3000);
            	 sel.deselectByIndex(i);
             }

	}

}
