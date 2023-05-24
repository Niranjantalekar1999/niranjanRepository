package testNGpack;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoTest3 {
  @Test
  public void test3() {
	  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://www.google.com/");
      driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
  }
}
