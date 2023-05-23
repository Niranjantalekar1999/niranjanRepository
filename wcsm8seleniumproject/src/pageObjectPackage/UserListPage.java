package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage  {

	@FindBy(xpath="//input[@value='Create New User']") private WebElement createNewUserButton;
	@FindBy(xpath="//*[@name='username']") private WebElement userNameTB;
	@FindBy(xpath="//*[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath="//*[@name='passwordTextRetype']") private WebElement retypePasswordTB;
	@FindBy(xpath="//*[@name='firstName']") private WebElement firstNameTB;
	@FindBy(xpath="//*[@name='lastName']") private WebElement lastNameTB;
	@FindBy(xpath="//input[@type='submit']") private WebElement createUserButton;
	@FindBy(xpath="//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") private WebElement cancelButton;
    @FindBy(xpath = "(//a[contains(text(),'System,')]/ancestor::tbody/descendant::a)[1]") private WebElement userCreatedLink;
	@FindBy(xpath="//input[@value='Delete This User']") private WebElement deleteUserButton;
	
	//initialization
	public UserListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization

	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUserNameTB() {
		return userNameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getUserCreatedLink() {
		return userCreatedLink;
	}

	public WebElement getDeleteUserButton() {
		return deleteUserButton;
	}
	
	public void createUserMethod(String usn,String pass,String Fn,String Ln) throws InterruptedException
	{
		
		createNewUserButton.click();
		Thread.sleep(1000);
		userNameTB.sendKeys(usn);
		Thread.sleep(1000);
		passwordTB.sendKeys(pass);
		retypePasswordTB.sendKeys(pass);
		Thread.sleep(1000);
		
		firstNameTB.sendKeys(Fn);
		Thread.sleep(1000);
		
		lastNameTB.sendKeys(Ln);
		Thread.sleep(1000);
		createUserButton.click();
		

		
	}
	
	public void deleteUserMethod() throws InterruptedException
	{
		userCreatedLink.click();
		Thread.sleep(1000);
		deleteUserButton.click();
		WorkLib wlp = new WorkLib();
		wlp.handleConfirmationPopup();
		Thread.sleep(1000);
	}
	
}
