package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.SeMethods;

public class FlipkarHomePage extends SeMethods{
	
	
	public FlipkarHomePage() {
		PageFactory.initElements(driver, this);
       }
   
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']") WebElement popup;
	public FlipkarHomePage closePopUp() {		
		click(popup);
		return this;
	}
	
	@FindBy(xpath="//span[@class='_1QZ6fC _3Lgyp8']") WebElement eleDrop;
	@FindBy(xpath="//a[text()='Mi']") WebElement mI;
	public MiPage electronicsP() {		
		Actions action= new Actions(driver);
		action.moveToElement(eleDrop).build().perform();
		
		WebDriverWait wait= new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(mI));
		mI.click();
		return new MiPage();
	}
	
}
