package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import projectObject.homepage;
import projectObject.loginPage;
import projectObject.myAccount;
import testBase.BaseClass;

public class TC002_userLogin extends BaseClass{
	
@Test
public void login()
{
	homepage hp=new homepage(driver);
	hp.myacc();
	hp.login();
	
	loginPage lp=new loginPage(driver);
	lp.sentEmail(p.getProperty("username"));
	lp.sentpswd(p.getProperty("pswd"));
	lp.clicklogin();
	
	myAccount ac=new myAccount(driver);
	boolean st= ac.myaccount();
	
	Assert.assertEquals(st, true);
}

}
