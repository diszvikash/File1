package com.Klu.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Klu.GenericLib.BaseTest;

public class HomePage 
{
	@FindBy(xpath="//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath="//a[text()='Reports']") private WebElement reportsTab;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	
	public void ClickLeadsTab()
	{
		leadsTab.click();
	}

	public void ClickReportsTab()
	{
		reportsTab.click();
	}

}
