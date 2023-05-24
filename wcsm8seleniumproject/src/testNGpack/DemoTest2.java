package testNGpack;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DemoTest2 {
  @Test
  public void test2() {
	  System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
      WebDriver driver=new EdgeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://www.google.com/");
      driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
  }
  
}
