package scrollOperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollDown2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(co);
        
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://in.puma.com/in/en?utm_source=GGL&utm_medium=BS&utm_campaign=BS_GGL_SEA_TXT_Brand-Exact&utm_aud=OTH&utm_obj=OLC&gclid=Cj0KCQjw9deiBhC1ARIsAHLjR2DOmg88e5b2VlqF-yPI7Qsw0-pnqpjmgmR7Z3QpSt56q1C5Ye5e9CwaAtxBEALw_wcB");
		driver.findElement(By.xpath("//span[text()='Men']")).click();
		
	

	}

}
