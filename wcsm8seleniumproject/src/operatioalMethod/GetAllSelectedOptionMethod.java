package operatioalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Mr%20vijay%20patil/Desktop/Niranjan%20Talekar%201/html/multi%20select%20dropdown.html");

		WebElement dropdown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropdown);
		
		for(int i=0;i<8;i++)
		{
			sel.selectByIndex(i);
		}
	       List<WebElement> allOptions = sel.getAllSelectedOptions();
	       
	       for(WebElement op:allOptions)
	       {
	    	   String options = op.getText();
	    	   System.out.println(options);
	       }

	}

}
