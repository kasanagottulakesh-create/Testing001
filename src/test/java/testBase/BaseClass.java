package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {

	
public WebDriver driver;
public Logger logger;
public Properties p;
	
	@BeforeClass()
	@Parameters({"os","browser"})
	public void setup(String os, String  br) throws IOException
	{
		
		logger = LogManager.getLogger(this.getClass());
		
		FileReader file = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
		p=new Properties();
		p.load(file);
		
	/*	if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities ca=new DesiredCapabilities();
			//os
			if(os.equalsIgnoreCase("windows"))
			{
				ca.setPlatform(Platform.WIN11);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				ca.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("no matching os");
				return;
			}
			
			//browser
			switch(br.toLowerCase()) 
			{
			case "chrome":ca.setBrowserName("chrome");break;
			case "edge":ca.setBrowserName("edge");break;
			default: System.out.println("not matching browser"); return;
			
			}
			
			driver=new RemoteWebDriver(new URL("http://192.168.1.8:4444"),ca);
			
		}
		*/
		
		
		
		
		switch(br.toLowerCase()) 
		{
		case "chrome":driver=new ChromeDriver(); break;
		case "edge":driver=new EdgeDriver(); break;
		
		}
		
		//driver.manage().deleteAllCookies();
		driver.get(p.getProperty("appURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}
	
	@AfterClass()
	
	public void tearDown()
	{
		driver.quit();
	}
	
	
	 public String randomstring()
	    {
	 	   String generate=RandomStringUtils.randomAlphabetic(7);
	 	   return generate;
	    }
	
	
}
