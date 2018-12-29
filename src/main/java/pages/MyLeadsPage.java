package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}

		@FindBy(how=How.XPATH, using = "//a[text()='Create Lead']") WebElement createLead;

	
	public CreateLeadPage clickCreateLead() {
		click(createLead);
		return new CreateLeadPage();
	}
	}


