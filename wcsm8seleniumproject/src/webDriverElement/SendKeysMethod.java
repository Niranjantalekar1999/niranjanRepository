package webDriverElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://desktop-4rv143a/login.do");

         WebElement usernameTB = driver.findElement(By.name("username"));
		 WebElement passwordTB = driver.findElement(By.name("pwd"));
		 
		 usernameTB.sendKeys("admin");
		 passwordTB.sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
	}

}
