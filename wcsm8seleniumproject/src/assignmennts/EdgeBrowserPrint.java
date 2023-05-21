package assignmennts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBrowserPrint {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}

}
