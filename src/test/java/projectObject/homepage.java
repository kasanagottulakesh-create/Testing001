package projectObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends testBaseee {
	
	
	
	public homepage (WebDriver driver)
	{
		super(driver);
		
	}
	
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement lkmyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lkregister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement lnklogin;
	
	
	public void myacc()
	{
		lkmyaccount.click();
	}
	
	public void reguser()
	{
		lkregister.click();
	}
	
	public void login()
	{
		lnklogin.click();
	}

}
