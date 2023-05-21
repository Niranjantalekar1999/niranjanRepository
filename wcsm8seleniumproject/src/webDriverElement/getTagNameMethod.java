package webDriverElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagNameMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://www.selenium.dev/");
        
        WebElement tagNameSp = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
        
        String tagName = tagNameSp.getTagName();
        System.out.println(tagName);
	}
}
