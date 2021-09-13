package com.Klu.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Klu.GenericLib.BaseTest;

public class LoginPage 
{
	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
	@FindBy(xpath="//input[@title='Sign In']") private WebElement signInBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement untb()
	{
		return untb;
	}
	public void setuntb(WebElement untb)
	{
		this.untb=untb;
	}
	
	public WebElement pwtb()
	{
		return pwtb;
	}
	public void setpwtb(WebElement pwtb)
	{
		this.pwtb=pwtb;
	}
	
	public WebElement signInBtn()
	{
		return signInBtn;
	}
	public void setsignInBtn(WebElement signInBtn)
	{
		this.signInBtn=signInBtn;
	}
	
	public void LoginToApp(String un, String pwd)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		signInBtn.click();
	}

}












