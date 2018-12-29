package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{

	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}

	//@FindBy(id = "LinkText" ,using = "decorativeSubmit") WebElement createlead;
	@FindBy(how = How.LINK_TEXT, using = "Leads")	WebElement leads;
	
	/*public CreateLeadPage clickCreateLead() {		
		click(createlead);
		return new CreateLeadPage();
	
	}  */
	public MyLeadsPage clickLeads() {
		click(leads);
		return new MyLeadsPage();
	}

}
