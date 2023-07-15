package pagePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MGRCompletedTask  {
    @FindBy(xpath="//*[contains(@class,'item active')]") private WebElement OpenTask;
	@FindBy(xpath="//input[@name='customers[44]']") private WebElement CheakBox;
	@FindBy(xpath="//input[@value='Complete Selected Tasks']") private WebElement CompleteSelectTaskButton;
	@FindBy(xpath="//*[contains(@class,'item active')]") private WebElement ProjectAndCust;
	@FindBy(xpath="//TD[@class='selectCustomer']/INPUT[@value='on']") private WebElement SelectCustProjectCheackBox;
	@FindBy(xpath="//input[@value='Archive Selected']") private WebElement ArchivedProject; 
	@FindBy(xpath="//a[text()='Completed Tasks']") private WebElement CompletedTask;
	
	// Initialization
	
	public MGRCompletedTask(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization 
	public WebElement getOpenTask() {
		return OpenTask;
	}
	public WebElement getCheakBox() {
		return CheakBox;
	}
	public WebElement getCompleteSelectTaskButton() {
		return CompleteSelectTaskButton;
	}
	
	public WebElement getCompletedTask() {
		return CompletedTask;
	}
	public WebElement getProjectAndCust() {
		return ProjectAndCust;
	}
	public WebElement getSelectCustProjectCheackBox() {
		return SelectCustProjectCheackBox;
	}
	public WebElement getArchivedProject() {
		return ArchivedProject;
	}
	public void completeTaskMGRMethod() throws InterruptedException
	{
		OpenTask.click();
		Thread.sleep(2000);
		CompletedTask.click();
		Thread.sleep(2000);
		CheakBox.click();
		Thread.sleep(2000);
		CompleteSelectTaskButton.click();
		Thread.sleep(2000);
		ProjectAndCust.click();
		Thread.sleep(2000);
		SelectCustProjectCheackBox.click();
		Thread.sleep(2000);
		ArchivedProject.click();
		
	}
	
}
