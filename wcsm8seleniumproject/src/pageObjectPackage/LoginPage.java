package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

	//@FindBy Annotation
	
	
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="pwd") private WebElement passwordTB;
	@FindBy(id="loginButton") private WebElement button;
	@FindBy(xpath="//input[@name=='remember']") private WebElement checkBox ;
	@FindBy(linkText="Actimind") private WebElement actimindLink;
	
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getButton() {
		return button;
	}
	
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getActimindLink() {
		return actimindLink;
	}
		
	public void validLogin(String validUsername,String validPassword) throws InterruptedException
	{
		usernameTB.sendKeys(validUsername);
		Thread.sleep(2000);
		passwordTB.sendKeys(validPassword);
		Thread.sleep(2000);
		button.click();

	}
	
	public void invalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usernameTB.sendKeys(invalidUsername);
		passwordTB.sendKeys(invalidPassword);
		Thread.sleep(2000);
		button.click();
		Thread.sleep(2000);
		usernameTB.clear();
		
	}
}
