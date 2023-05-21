package operatioalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Mr%20vijay%20patil/Desktop/Niranjan%20Talekar%201/html/multi%20select%20dropdown.html");

		WebElement dropdown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropdown);

		WebElement option = sel.getWrappedElement();
		String value = option.getText();
		System.out.println(value);
	}

}
