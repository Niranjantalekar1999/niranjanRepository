package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPath2 {

	public static void main(String[] args) throws InterruptedException {
	
      System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
      
      WebDriver driver = new EdgeDriver();
      
      driver.manage().window().maximize();
      
      driver.get("https://in.puma.com/in/en?msclkid=b4e873c8274219b80df717e46a3fbf51&utm_aud=OTH&utm_campaign=BS_BNG_SEA-TXT_Brand-Exact&utm_medium=BS&utm_obj=CONV&utm_source=BNG-SEA-TXT");
      
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//span[text()='Men']")).click();
      
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//span[text()='PUMA White-Matte Silver']")).click();
      
      driver.quit();
     
	}

}
