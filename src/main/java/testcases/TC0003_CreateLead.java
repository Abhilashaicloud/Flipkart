package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.DataInputProvider;
import wdMethods.ProjectMethods;
public class TC0003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TC0003_CreateLead";
		testDescription = "CreateLead";
		authors = "Imman";
		category = "smoke";
		dataSheetName = "TC0003__CreateLead";
		testNodes = "Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void createLead(String userName,String password ,String companyName,String firstName,String lastName) {
		new LoginPage().enterUserName(userName).enterPassword(password).clickLogin().clickCRMSFA().clickLeads().clickCreateLead().enterCompanyName(companyName)
    	.enterFirstName(firstName)
		.enterLastName(lastName)   
		.clickCreateLeadbutton();
	}
	
	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	
	
	}
