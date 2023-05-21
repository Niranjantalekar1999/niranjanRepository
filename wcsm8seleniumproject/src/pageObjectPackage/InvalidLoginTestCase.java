package pageObjectPackage;

import java.io.IOException;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException {

		BaseTest bt = new BaseTest(); 
		bt.setUp();
		Flib flib = new Flib();
		
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		int rc = flib.rowCount(EXCEL_PATH,"invalidcreads");
		for(int i=1;i<=rc;i++)
		{
			
			String invalidUsername = flib.readExcelData(EXCEL_PATH,"invalidcreads",i,0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH,"invalidcreads",i,0);
			lp.invalidLogin(invalidUsername,invalidPassword);
			
		}
		
		bt.tearDown();
   }
}