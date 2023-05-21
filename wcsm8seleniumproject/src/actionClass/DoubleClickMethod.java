package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-4rv143a/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		
		
		Actions act = new Actions(driver);
		
		act.doubleClick(target).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
