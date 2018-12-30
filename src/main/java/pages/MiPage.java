package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wdMethods.SeMethods;

public class MiPage  extends SeMethods{
	
	
	public  MiPage() {
		PageFactory.initElements(driver, this);
       }
   
	@FindBy(xpath="//div[text()='Newest First']") WebElement cN;
	public  MiPage clickNew() {		
		click(cN);
		return this;
	}

	
	@FindBy(className="_3wU53n") WebElement brandele;
	@FindBy(xpath="//div[@class='_1vC4OE _2rQ-NK']") WebElement priceEle;	
	public MiPage fetchData() {
		List<WebElement> bn =driver.findElements(By.className("_3wU53n"));	
		List<String> ls = new ArrayList<>();		
		for (WebElement eachBn : bn) {
			ls.add(eachBn.getText());			
		}
		
		List<WebElement> pn =driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));	
		List<String> ls1 = new ArrayList<>();		
		for (WebElement eachPn : pn) {
			ls1.add(eachPn.getText());			
		}
		
		
		for (int i = 0; i <bn.size()-1; i++) {			
			System.out.println(ls.get(i)+"---->"+ls1.get(i));			
		}
		return this;

	}
}
