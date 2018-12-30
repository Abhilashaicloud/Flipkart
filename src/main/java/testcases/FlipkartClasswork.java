package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FlipkarHomePage;
import wdMethods.SeMethods;

public class FlipkartClasswork extends SeMethods{
	

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeClass
	public void beforeClass(){		
		startTestModule(testCaseName, testDescription);	
	}

	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testNodes);
		test.assignCategory(category);
		test.assignAuthor(authors);
		startApp("chrome", "https://www.flipkart.com/");		
	}

	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
	}
	
	@BeforeTest
	public void setData() {
		testCaseName = "FipkartClasswork";
		testDescription = "CreateLead";
		authors = "Abhilasha";
		category = "smoke";
		testNodes = "Flipkart";
	}
	
	@Test
	public void flipkartwrk()
	{
		new FlipkarHomePage().closePopUp().electronicsP()
		.clickNew()
		.fetchData();
	}
}
