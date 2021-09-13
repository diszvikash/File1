package com.Klu.Statement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Klu.GenericLib.BaseTest;

public class CustomViewReportsPage 
{
	@FindBy(xpath="//input[@value='Create New Report']") private WebElement createNewReportsBtn;
	
	public CustomViewReportsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void clickCreateNewReportsBtn()
	{
		createNewReportsBtn.click();
	}
}
