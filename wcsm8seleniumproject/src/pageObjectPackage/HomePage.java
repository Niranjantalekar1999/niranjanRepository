package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest{

	@FindBy(xpath="//a[.='Logout']") private WebElement LogoutLink;
	@FindBy(xpath="//A[@class='content users']/IMG[@class='sizer']") private WebElement userModule;
	@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']") private WebElement taskModule;
	@FindBy(xpath="//A[@class='content tt_selected selected']/DIV[2]/IMG") private WebElement timeTrackModule;
	@FindBy(xpath="//A[@class='content reports']/IMG[@class='sizer']") private WebElement reportModule;
	
	// intialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	public WebElement getUserModule() {
		return userModule;
	}
	public WebElement getTaskModule() {
		return taskModule;
	}
	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}
	public WebElement getReportModule() {
		return reportModule;
	}
	
	
	// operational Methods
	
		public void logOutMethod()
		{
			LogoutLink.click();
		}
		
		public void usersModuleMethod()
		{
			userModule.click();
		}
	

}

