package projectObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccount extends testBaseee{
	
	public myAccount(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement myacc;
	
	public boolean myaccount()
	{
		try
		{
			return(myacc.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

}
