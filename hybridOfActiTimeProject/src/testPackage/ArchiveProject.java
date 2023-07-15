package testPackage;


import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListners;
import genericPackage.Flib;

import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.MGRCompletedTask;

@Listeners(CustomeListners.class)
public class ArchiveProject extends BaseTest {
     @Test
	public void validTestCase() throws IOException, InterruptedException
	{
//		BaseTest bt = new BaseTest();
//		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username1"),flib.readPropertyData(PROP_PATH, "password1"));
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.taskModuleMethod();
		MGRCompletedTask ct = new MGRCompletedTask(driver);
		ct.completeTaskMGRMethod();
	}
}