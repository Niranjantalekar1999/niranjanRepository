package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Worklib extends BaseTest {
	
	public void acceptAlert()
	{
		driver.switchTo().alert().accept();
	}
	
	public void dissmisAlert()
	{
		driver.switchTo().alert().dismiss();
	}

	public void acceptConfirmation()
	{
		driver.switchTo().alert().accept();
	}
	
	public void dissmisConfirmation()
	{
		driver.switchTo().alert().dismiss();
	}
	
	// Handle Mouse Actions
		public void rightClick(WebElement target)
		{
			Actions act = new Actions(driver);
			act.contextClick(target).perform();
		}
		
		public void doubleClickMethod(WebElement target)
		{
			Actions act = new Actions(driver);
			act.doubleClick(target).perform();
		}
		
		public void mouseHoverMethod(WebElement target)
		{
			Actions act = new Actions(driver);
			act.moveToElement(target).perform();
		}
		public void dragAndDropMethod(WebElement src,WebElement target)
		{
			Actions act = new Actions(driver);
			act.dragAndDrop(src, target).perform();
		}
		
		// Handle Frame
		public void handleFrameByIndex(int index)
		{
			driver.switchTo().frame(index);
		}
		
		public void handleFrameByNameOrId(String NameOrId)
		{
			driver.switchTo().frame(NameOrId);
		}
		
		public void handleFrameByFrameElement(WebElement frame)
		{
			driver.switchTo().frame(frame);
		}
		
		// handle DropDown Methods
		
		public void dropDownSelect(WebElement element, int index)
		{
		   Select sel = new Select(element);
		   sel.selectByIndex(index);
		}
		
}