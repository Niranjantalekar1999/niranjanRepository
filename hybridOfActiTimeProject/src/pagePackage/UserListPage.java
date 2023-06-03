package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class UserListPage {

	@FindBy(xpath="//input[@value='Create New User']") private WebElement CreateNewUserButto;
	@FindBy(xpath="//*[@name='username']") private WebElement UserNameTB;
	@FindBy(xpath="//*[@name='passwordText']") private WebElement PasswordTB;
	@FindBy(xpath="//*[@name='passwordTextRetype']") private WebElement PasswordTextRetype; 
	@FindBy(xpath="//*[@name='firstName']") private WebElement FirstNameTB;
	@FindBy(xpath="//*[@name='lastName']") private WebElement LastNameTB;
	@FindBy(xpath = "(//a[contains(text(),'System,')]/ancestor::tbody/descendant::a)[1]") private WebElement userCreatedLink;
	@FindBy(xpath = "//input[@value='Delete This User']") private WebElement DeleteUserButton;
	@FindBy(xpath="//*[@id='right9']") private WebElement EnterTimeTrack;
	@FindBy(xpath="//*[@id='right12']") private WebElement ModifyTimeTrack;
	@FindBy(xpath="//*[@id='right1']") private WebElement GenerateReports;
	@FindBy(xpath="//*[@id='right2']") private WebElement ManageTimeTrack;
	@FindBy(xpath = "//*[@id='right2']") private WebElement ManageCust;
	@FindBy(xpath = "//*[@id='right1']") private WebElement ManageReport;
	@FindBy(xpath="//*[@id='right5']") private WebElement ManageUsers;
	@FindBy(xpath="//*[@id='right7']") private WebElement ManageBillingTypes; 
	@FindBy(xpath="//input[@type='submit']") private WebElement CreateUserButton;
	@FindBy(xpath="//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") private WebElement CancelButton; 


	// Initialization

	public UserListPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}




	public WebElement getUserCreatedLink() {
		return userCreatedLink;
	}


	// utilization

	public WebElement getManageCust() {
		return ManageCust;
	}




	public WebElement getManageReport() {
		return ManageReport;
	}

	public WebElement getDeleteUserButton() {
		return DeleteUserButton;
	}

	public WebElement getCreateNewUserButto() {
		return CreateNewUserButto;
	}


	public WebElement getUserNameTB() {
		return UserNameTB;
	}


	public WebElement getPasswordTB() {
		return PasswordTB;
	}


	public WebElement getPasswordTextRetype() {
		return PasswordTextRetype;
	}


	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}


	public WebElement getLastNameTB() {
		return LastNameTB;
	}


	public WebElement getEnterTimeTrack() {
		return EnterTimeTrack;
	}


	public WebElement getModifyTimeTrack() {
		return ModifyTimeTrack;
	}


	public WebElement getGenerateReports() {
		return GenerateReports;
	}


	public WebElement getManageTimeTrack() {
		return ManageTimeTrack;
	}


	public WebElement getManageUsers() {
		return ManageUsers;
	}


	public WebElement getManageBillingTypes() {
		return ManageBillingTypes;
	}


	public WebElement getCreateUserButton() {
		return CreateUserButton;
	}


	public WebElement getCancelButton() {
		return CancelButton;
	}

	//operational Method
	public void createUserMethod(String usn,String pass,String Fn,String Ln) throws InterruptedException
	{
		CreateNewUserButto.click();
		Thread.sleep(2000);
		UserNameTB.sendKeys(usn);
		Thread.sleep(2000);
		PasswordTB.sendKeys(pass);
		PasswordTextRetype.sendKeys(pass);
		Thread.sleep(1000);
		FirstNameTB.sendKeys(Fn);
		Thread.sleep(1000);
		LastNameTB.sendKeys(Ln);
		Thread.sleep(1000);

	}

	public void deleteUserMethod() throws InterruptedException
	{
		userCreatedLink.click();
		Thread.sleep(1000);
		DeleteUserButton.click();
		Worklib wl = new Worklib();
		wl.acceptConfirmation();
	}

	public void selectCheakBox()
	{
		ModifyTimeTrack.click();
		ManageCust.click();
		GenerateReports.click();
		ManageUsers.click(); 
		ManageBillingTypes.click();
	}
	
	public void managerCreateMethod()
	{
		CreateUserButton.click();
	}
}