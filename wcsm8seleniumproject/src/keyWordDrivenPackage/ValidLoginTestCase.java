package keyWordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		
		
		Flib flib = new Flib();
		bt.openBrowser();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH,"username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH,"password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();

	}

}
