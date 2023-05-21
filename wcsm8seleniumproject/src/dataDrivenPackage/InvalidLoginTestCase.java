package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://desktop-4rv143a/login.do");
        
        //Read exteral data from create the obj of flib 
        
        Flib flib = new Flib();
        
        int rc = flib.rowCount("./data/ActiTimeTestData.xlsx","invalidcreads");
        
        for(int i=1;i<=rc;i++)
        {
        Thread.sleep(1000);
        String invalidUserame = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreads",i,0);
        String invalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreads",i,1);
        
        driver.findElement(By.name("username")).sendKeys(invalidUserame);
        driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).clear();
        }
        
   }

}
