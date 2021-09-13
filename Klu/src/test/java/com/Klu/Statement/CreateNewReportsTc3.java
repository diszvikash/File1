package com.Klu.Statement;

import org.testng.annotations.Test;

import com.Klu.GenericLib.BaseTest;
import com.Klu.GenericLib.Filelib;
import com.Klu.Pages.HomePage;
import com.Klu.Pages.LoginPage;

public class CreateNewReportsTc3 extends BaseTest
{
@Test
	public void Sumo() throws Throwable 
	{
		
		BaseTest bt=new BaseTest();
		bt.openbrowser();
		
		Thread.sleep(2000);
		Filelib flib=new Filelib();
		
		LoginPage lp=new LoginPage();
		lp.LoginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		Thread.sleep(2000);
		HomePage hp=new HomePage();
		hp.ClickReportsTab();
		
		CustomViewReportsPage cvrp=new CustomViewReportsPage();
		cvrp.clickCreateNewReportsBtn();
		
		Thread.sleep(2000);
		CreateReportPage crp=new CreateReportPage();
		crp.LeadOption("Accounts");
		crp.RelatedOption1("Contacts");
		crp.cont();
		
	
	}

}
