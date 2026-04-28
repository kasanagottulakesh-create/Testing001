package projectObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationPage extends testBaseee {
	

	
     public registrationPage (WebDriver driver)
	{
		super(driver);
	}
      
      @FindBy(xpath="//input[@id='input-firstname']")
      WebElement txtfirstName;
      
      @FindBy(xpath="//input[@id='input-lastname']")
      WebElement txtlastName;
      
      @FindBy(xpath="//input[@id='input-email']")
      WebElement txtemail;
      
      @FindBy(xpath="//input[@id='input-telephone']")
      WebElement txtphn;
      
      @FindBy(xpath="//input[@id='input-password']")
      WebElement txtpswd;
      
      @FindBy(xpath="//input[@id='input-confirm']")
      WebElement txtpswdConfirm;
      
      @FindBy(xpath="//input[@name='agree']")
      WebElement rdicheck;
      
      @FindBy(xpath="//input[@value='Continue']")
      WebElement bttncontinue;
      
      @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
      WebElement messageconfirmation;
      
      
      public void fname(String name)
  	{
    	  txtfirstName.sendKeys(name);
  	}
      
      public void lstname(String lsname)
    	{
    	  txtlastName.sendKeys(lsname);
    	}
      
      public void email(String emailtxt)
    	{
    	  txtemail.sendKeys(emailtxt);
    	}
      
      public void phnumber(String ph)
  	{
    	  txtphn.sendKeys(ph);
  	}
      
      public void password(String pswd)
  	{
    	  txtpswd.sendKeys(pswd);
  	}
      
      public void conpassword(String cpswd)
    	{
    	  txtpswdConfirm.sendKeys(cpswd);
    	}
      
      
      public void checkBox()
  	{
    	  rdicheck.click();  
  	}
      
      public void contbutton()
    	{
    	  bttncontinue.click();  
    	}
      
      
      public String getconfirmationmsg()
      {
    	  try
    	  {
    		 return (messageconfirmation.getText());
    	  }
    	  
    	  catch(Exception e)
    	  {
    		  return(e.getMessage());
    	  }
      }
      
	
	

}
