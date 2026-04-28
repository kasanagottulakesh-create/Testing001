package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import projectObject.homepage;
import projectObject.registrationPage;
import testBase.BaseClass;

public class Tc001_userRegistration extends BaseClass {
	 
 
	
	@Test
	public void userRegistrtion ()
	{
		logger.info("starting testing ");
		
		homepage hp=new homepage(driver);
		hp.myacc();
		
		logger.info("clicked on myaccount");
        hp.reguser();
        logger.info("clicked on register");
        registrationPage rp=new registrationPage(driver);
        rp.fname(randomstring().toUpperCase());
        rp.lstname("united");
        rp.email(randomstring()+"@yopmail.com");
        rp.phnumber("7993600493");
        rp.password("lakeshtest123");
        rp.conpassword("lakeshtest123");
        rp.checkBox();
        rp.contbutton();
        logger.info("clicked on continue button");
       String confirmation= rp.getconfirmationmsg();
       Assert.assertEquals(confirmation, "Your Account Has Been Created!");
       
		logger.info("ending testing");
	}
	
	//Random STring method:
    
  /*  public String randomstring()
    {
 	   String generate=RandomStringUtils.randomAlphabetic(7);
 	   return generate;
    }  */
	
	

}
