package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class CreateTaskPage {
	
	@FindBy(xpath="//a[.='Open Tasks']") private WebElement OpenTaskModule;
	@FindBy(xpath="//input[@value='Create New Tasks']") private WebElement CreateNewTaskButton;
	@FindBy(xpath="//*[@name='customerId']") private WebElement CustomerDropdown;
	@FindBy(xpath="//*[@name='projectId']") private WebElement ProjectDropdown;
	@FindBy(xpath="//TD[@id='task0.cell']/INPUT[@class='text']") private WebElement TaskNameTB1;
	@FindBy(xpath="//TD[@id='task1.cell']/INPUT[@class='text']") private WebElement TaskNameTB2;
	@FindBy(xpath="//select[@name='task[0].billingType']") private WebElement BillingType1;
	@FindBy(xpath="//DIV[@id='bt1']/SELECT[.='Non-Billable") private WebElement BillingType2;
	@FindBy(xpath="//input[@name='task[0].markedToBeAddedToUserTasks']") private WebElement AddMyTimeTrack1;
	@FindBy(xpath="//input[@name='task[1].markedToBeAddedToUserTasks']") private WebElement AddMyTimeTrack2;
	@FindBy(xpath="//input[@value='Create Tasks']") private WebElement CreateTaskButton;
	@FindBy(xpath="//input[@onclick='cancelTasksCreation();']") private WebElement CancelButton;
	
	//initialization
	public CreateTaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	// utilization
	public WebElement getOpenTaskModule() {
		return OpenTaskModule;
	}
	public WebElement getCreateNewTaskButton() {
		return CreateNewTaskButton;
	}
	public WebElement getCustomerDropdown() {
		return CustomerDropdown;
	}
	public WebElement getProjectDropdown() {
		return ProjectDropdown;
	}
	public WebElement getTaskNameTB1() {
		return TaskNameTB1;
	}
	public WebElement getTaskNameTB2() {
		return TaskNameTB2;
	}
	public WebElement getBillingType1() {
		return BillingType1;
	}
	public WebElement getBillingType2() {
		return BillingType2;
	}
	public WebElement getAddMyTimeTrack1() {
		return AddMyTimeTrack1;
	}
	public WebElement getAddMyTimeTrack2() {
		return AddMyTimeTrack2;
	}
	public WebElement getCreateTaskButton() {
		return CreateTaskButton;
	}
	public WebElement getCancelButton() {
		return CancelButton;
	}
	
	//operational
	
	public void createTask(int index2,int index,int index1,String taskName) throws InterruptedException
	{
		OpenTaskModule.click();
		CreateNewTaskButton.click();
		Worklib wl = new Worklib();
		wl.dropDownSelect(CustomerDropdown,index);
		Thread.sleep(2000);
		wl.dropDownSelect(ProjectDropdown, index2);
		Thread.sleep(2000);
		TaskNameTB1.sendKeys(taskName);
		Thread.sleep(1000);
		wl.dropDownSelect(BillingType1, index1);
		Thread.sleep(1000);
		AddMyTimeTrack1.click();
		Thread.sleep(1000);
		CreateTaskButton.click();
		
	}
	
	
}

