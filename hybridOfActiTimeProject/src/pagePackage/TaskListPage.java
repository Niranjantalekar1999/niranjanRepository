package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class TaskListPage {

	@FindBy(xpath="//a[.='Open Tasks']") private WebElement OpenTaskModule;
	@FindBy(xpath="//a[.='Completed Tasks']") private WebElement CompletedTask;
	@FindBy(xpath="//a[.='Projects & Customers']") private WebElement Project_CustModule;
	@FindBy(xpath="//a[.='Archives']") private WebElement ArchivesModule;
	@FindBy(xpath="//input[@value='Create New Customer']") private WebElement CNCustomer;
	@FindBy(xpath="//input[@value='Create New Project']") private WebElement CNProject;
	@FindBy(xpath="//*[@name='name']") private WebElement CustomerNameTB;
	@FindBy(xpath="//input[@type='submit']") private WebElement CreateCustomerButton;
	@FindBy(xpath="//input[@onclick='cancelCustomerCreation();']") private WebElement CancelCustomerButton;

	@FindBy(xpath="//input[@name='name']") private WebElement  ProjectNameTB;
	@FindBy(xpath="//*[@name='createProjectSubmit']") private WebElement CreateProjectButton;
	@FindBy(xpath="//input[@onclick='cancelProjectCreation();']") private WebElement CancelButton;
	@FindBy(xpath="//select[@name='customerId']") private WebElement SelectCustDropdown;
	


//initialization
public TaskListPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

//utilization
public WebElement getOpenTaskModule() {
	return OpenTaskModule;
}


public WebElement getCompletedTask() {
	return CompletedTask;
}


public WebElement getProject_CustModule() {
	return Project_CustModule;
}


public WebElement getArchivesModule() {
	return ArchivesModule;
}


public WebElement getCNCustomer() {
	return CNCustomer;
}


public WebElement getCNProject() {
	return CNProject;
}


public WebElement getCustomerNameTB() {
	return CustomerNameTB;
}


public WebElement getCreateCustomerButton() {
	return CreateCustomerButton;
}


public WebElement getCancelCustomerButton() {
	return CancelCustomerButton;
}


public WebElement getProjectNameTB() {
	return ProjectNameTB;
}


public WebElement getProjectNameTB1() {
	return ProjectNameTB;
}


public WebElement getCreateProjectButton() {
	return CreateProjectButton;
}


public WebElement getCancelButton() {
	return CancelButton;
}

public WebElement getSelectCustDropdown() {
	return SelectCustDropdown;
}
public void createNewCustomerMethod(String custName) throws InterruptedException
{
	Project_CustModule.click();
	CNCustomer.click();
	CustomerNameTB.sendKeys(custName);
	Thread.sleep(2000);
	CreateCustomerButton.click();
}


public void createProjectMethod(int index,String proName) throws InterruptedException
{
	CNProject.click();
	Worklib wb = new Worklib();
	wb.dropDownSelect(SelectCustDropdown,index);
	Thread.sleep(1000);
	ProjectNameTB.sendKeys(proName);
	Thread.sleep(2000);
	CreateProjectButton.click();
	Thread.sleep(1000);
}

}