package timhortons.pages;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.timhortons.com/")
public class calorieMatchPage extends PageObject {
	
	public void radioSelectRegion() {
		$("(//SPAN[@size='1.5'])[1]").click();
        $("//BUTTON[@data-testid='action-button-apply-language-selection'][text()='Apply' ]").click();
      
    }
	
	public void order() {
	    $("//A[@data-testid='order-desktop'][text()='Order']").click();
		
	}
	
	public void choosePickUp() {
		$("//SPAN[@class='prompts__TextWrapper-krlgo-0 gQnDgj'][text()='Pick Up']").click();
	}
	
	public void selectAddress() {
		$("//INPUT[@id='storelocator-input']").click();
		$("//INPUT[@id='storelocator-input']").typeAndEnter("6 Southdale Avenue");
	}
	
	public void clickOrderHere() {
	    $("(//BUTTON[@data-testid='order-here'][text()='Order here'][text()='Order here'])[2]").click();
	}  
	
	public void waitForVisibleTextToAppear() {
    $("//H4[@class='pickup-mode-contentth__Heading-x7gsor-2 ITlBp'][text()='Take-Out']").waitUntilVisible();
    
	}

	public void takeOut() {
		withTimeoutOf(5,TimeUnit.SECONDS);
		$("//H4[@class='pickup-mode-contentth__Heading-x7gsor-2 ITlBp'][text()='Take-Out']").click();
	}
	
	
	public void checkBagelCalorie() {
		
	 withTimeoutOf(5,TimeUnit.SECONDS);
		$("//H2[@data-testid='tile-header-section_7412'][text()='Bagels']").click();
	}
	
	public void checkEverythingBagelCalorie() {
		String expected = "207 Cals";
		$("//P[@class='tileth__ItemCalories-qvp911-4 kDcovk'][text()='297 Cals']").waitUntilClickable();
	    String calorie=$("//P[@class='tileth__ItemCalories-qvp911-4 kDcovk'][text()='297 Cals']").getText();
		System.out.println(calorie);
		
		Assert.assertEquals("Calorie does not match", expected, calorie);
	}
}	
	

