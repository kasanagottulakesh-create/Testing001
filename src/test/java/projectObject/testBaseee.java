package projectObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class testBaseee {

	
	WebDriver driver;
	
    testBaseee (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
}
