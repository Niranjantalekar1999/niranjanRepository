package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListners;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.PerformTask;

@Listeners(CustomeListners.class)

public class PeformTaskTestCase extends BaseTest {
    @Test
	public void performTaskUser() throws IOException, InterruptedException
	{
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username2"),flib.readPropertyData(PROP_PATH, "password2"));
		Thread.sleep(2000);
	    PerformTask pt = new PerformTask(driver);
	    pt.performTask();
	    
	}
}