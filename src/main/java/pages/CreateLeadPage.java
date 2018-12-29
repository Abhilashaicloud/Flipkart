package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public void CreateLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName") WebElement companyName;
	@FindBy(id="createLeadForm_firstName") WebElement firstName;
	@FindBy(id="createLeadForm_lastName") WebElement lastName;
	@FindBy(className="smallSubmit") WebElement eleCreateLeadButton;
	
	public CreateLeadPage enterCompanyName(String cname) {
		
		type(companyName,cname);
		return this;
	}
	public CreateLeadPage enterFirstName(String fname) {
		type(firstName, fname);
		return this;
	}
	public CreateLeadPage enterLastName(String lname) {
		type(lastName, lname);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadbutton() {		
		click(eleCreateLeadButton);
		return new ViewLeadPage();
	}
	
}
