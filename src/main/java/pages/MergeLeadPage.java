package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{

	public void CreateLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_companyName']") WebElement companyName;
	@FindBy(id="createLeadForm_firstName") WebElement firstName;
	@FindBy(id="createLeadForm_lastName") WebElement lastName;
	@FindBy(how=How.XPATH,using="//input[@value='Create Lead']") WebElement createlead;

	
	public MergeLeadPage enterCompanyName(String data) {
		
		type(companyName,data);
		return this;
	}
	public MergeLeadPage enterFirstName(String data) {
		type(firstName, data);
		return this;
	}
	public MergeLeadPage enterLastName(String data) {
		type(lastName, data);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadbutton() {		
		click(createlead);
		return new ViewLeadPage();
	}
	
}
