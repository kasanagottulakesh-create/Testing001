package projectObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends testBaseee{
	
	public loginPage (WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement setEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement setPswd;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement liklogin; 
	
	
	public void sentEmail(String email)
	{
		setEmail.sendKeys(email);
	}
	
	public void sentpswd(String pswd)
	{
		setPswd.sendKeys(pswd);
	}
	
	public void clicklogin()
	{
		liklogin.click();
	}
	

}
