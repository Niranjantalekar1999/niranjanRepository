package dynamicScreenShotPackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.google.common.io.Files;


public class BaseTest {
	static WebDriver driver;
	@BeforeGroups
	public void property() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-4rv143a/login.do");

	}

	public void faildMethod(String failedMethod)
	{
		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./ScreenShots/"+ failedMethod +".png");
			Files.copy(src, dest);
		}
		catch(Exception e)
		{

		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
