package pagePackage;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.BaseTest;

public class PerformTask extends BaseTest {

	@FindBy(xpath="//a[text()='Open Tasks']") private WebElement OpenTask;
	@FindBy(xpath="//a[text()='Perform Fuctional Testing']") private WebElement TaskLink;
	@FindBy(xpath="//a[text()='list this task on your Enter Time-Track page']") private WebElement OpenTaskLink;
	@FindBy(xpath="//input[@id='spent_9_2']") private WebElement WorkDay;
	@FindBy(xpath="//input[@id='SubmitTTButton']") private WebElement SaveChanges;
	@FindBy(xpath="//img[@id='timeTrack[6].commentImg[6]']") private WebElement Note;
	//@FindBy(xpath="//textarea[@name='comment']") private WebElement Comments;
	@FindBy(xpath="//input[@id='scbutton']") private WebElement OkButton;
	@FindBy(xpath="//a[text()='Enter Time-Track']") private WebElement EnterTimeTrack;


	//Initialization

	public PerformTask(WebDriver driver) {

		PageFactory.initElements(driver,this);
	}

	// Utilization 
	public WebElement getOpenTask() {
		return OpenTask;
	}
	public WebElement getTaskLink() {
		return TaskLink;
	}
	public WebElement getOpenTaskLink() {
		return OpenTaskLink;
	}
	public WebElement getWorkDay() {
		return WorkDay;
	}
	public WebElement getSaveChanges() {
		return SaveChanges;
	}
	public WebElement getNote() {
		return Note;
	}
//	public WebElement getComments()
//	{		
//		return Comments1;
//	}
	public WebElement getOkButton() {
		return OkButton;
	}

	public WebElement getEnterTimeTrack() {
		return EnterTimeTrack;
	}


	public void performTask() throws InterruptedException
	{
		Thread.sleep(2000);
		OpenTask.click();
		Thread.sleep(2000);
		TaskLink.click();
		Thread.sleep(2000);
		OpenTaskLink.click();
		Thread.sleep(2000);
		EnterTimeTrack.click();
		Thread.sleep(2000);
		WorkDay.sendKeys("10.00");
		//Note.click();
		//driver.switchTo().frame(6);
		Thread.sleep(2000);
		// Comments.sendKeys("Task completed");
		//	OkButton.click();
		SaveChanges.click();
	}


}
