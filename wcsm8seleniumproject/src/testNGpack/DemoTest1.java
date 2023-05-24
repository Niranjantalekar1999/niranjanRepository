package testNGpack;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest1 {
  @Test
  public void test1() {
	  
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.google.com/");
        driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
  
}
