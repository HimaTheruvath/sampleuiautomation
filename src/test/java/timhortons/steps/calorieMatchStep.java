package timhortons.steps;
import org.junit.Test;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import timhortons.actions.calorieMatchAction;

public class calorieMatchStep {
	@Steps
	calorieMatchAction calorieMatchTim;
	@Given("^I want to go to Tim Hortons homepage$")
	public void timHomepage() throws Throwable {
		calorieMatchTim.openTim();
	    
	     }

	@When("^I select the Language and Region$")
	public void selectLanguageRegion() throws Throwable {
		calorieMatchTim.selectRegion();
	    
	    }

	@Then("^I click on Order$")
	public void goToOrder() throws Throwable {
		calorieMatchTim.clickOrder();
		
	    }

	@Then("^I choose how i like to get my order$")
	public void getMyOrder() throws Throwable {
		calorieMatchTim.getOrderBy();
		
	 
	}

	@Then("^I locate the store manually$")
	public void locateStore() throws Throwable {
		calorieMatchTim.yourAddress();
		
	}

	@Then("^I do Order here$")
	public void doOrderHere() throws Throwable {
		calorieMatchTim.orderHere();
	    
	}

	@Then("^I prefer takeout option$")
	public void selectTakeOut() throws Throwable {
		calorieMatchTim.takeYourOrder();
	}

	@Then("^I like to check Bagel$")
	public void checkBagel() throws Throwable {
		calorieMatchTim.chooseBagel();	
	   
	}

	@Then("^I find calorie of Everything Bagel$")
	public void everythingBagel() throws Throwable {
		calorieMatchTim.chooseEverythingBagel();
	 
	}
	


}
