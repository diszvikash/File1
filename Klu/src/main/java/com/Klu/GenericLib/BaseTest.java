package com.Klu.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConst
{
	
	public static WebDriver driver;

	public void openbrowser() throws Throwable 
	{
	 	Filelib flib=new Filelib();
		String browserName=flib.readPropertyData(PROP_PATH, "browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
		    System.setProperty(GECKO_KEY, GECKO_VALUE);
		    driver=new FirefoxDriver();    
		}
		else
		{
			System.out.println("Enter Proper Browser Name");
		}
	 	
		driver.manage().window().maximize();
		String testurl=flib.readPropertyData(PROP_PATH, "url");
		driver.get(testurl);
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "loginTitle"),"Login Page");
	}
	
     public void closeBrowser()
     {
    	 driver.quit();
     }
	
}
