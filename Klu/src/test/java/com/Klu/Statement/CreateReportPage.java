package com.Klu.Statement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Klu.GenericLib.BaseTest;
import com.Klu.GenericLib.WebDriverCommonLib;

public class CreateReportPage 
{
	@FindBy(xpath="//select[@id='primarymodule']") private WebElement ddBtn;
	@FindBy(xpath="//select[@id='Leadsrelatedmodule']") private WebElement leadRelMod;
	@FindBy(xpath="//select[@id='Accountsrelatedmodule']") private WebElement accRelMod;
	@FindBy(xpath="//input[@name='nextBtn']") private WebElement contBtn;
	
	public CreateReportPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void LeadOption(String w)
	{
	  WebDriverCommonLib wlib= new  WebDriverCommonLib();
	  wlib.selectOption(w, ddBtn);
	}
	
	public void RelatedOption(String w1)
	{
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.selectoption(leadRelMod, w1);
		
	}
	
	public void RelatedOption1(String w2)
	{
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.selectoption(accRelMod, w2);
	}
	
    public void cont()
    {
	  contBtn.click();
    }
	
	
}
