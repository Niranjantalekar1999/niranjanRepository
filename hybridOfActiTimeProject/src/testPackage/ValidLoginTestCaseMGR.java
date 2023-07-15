package testPackage;


import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListners;
import genericPackage.Flib;
import pagePackage.CreateTaskPage;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TaskListPage;
import pagePackage.UserListPage;
@Listeners(CustomeListners.class)
public class ValidLoginTestCaseMGR extends BaseTest {
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
		hp.usersModuleMethod();
		Thread.sleep(2000);
		UserListPage ulp = new UserListPage(driver);
		ulp.createUserMethod(flib.readExcelData(EXCEL_PATH, "TestEngg",1,0),flib.readExcelData(EXCEL_PATH, "TestEngg",1,1),flib.readExcelData(EXCEL_PATH, "TestEngg",1,2),flib.readExcelData(EXCEL_PATH, "TestEngg",1,3));
		Thread.sleep(2000);
		ulp.managerCreateMethod();
		Thread.sleep(2000);
		CreateTaskPage ctp = new CreateTaskPage(driver);
		hp.taskModuleMethod();
		Thread.sleep(2000);
		ctp.createTask(4,3,1,flib.readExcelData(EXCEL_PATH, "TaskName",1,0));
		
		
		
	}
}

