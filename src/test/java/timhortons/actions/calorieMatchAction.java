package timhortons.actions;

import net.thucydides.core.annotations.Step;
import timhortons.pages.calorieMatchPage;

public class calorieMatchAction {
	calorieMatchPage calMatchPage;
	@Step
	public void openTim() {
		calMatchPage.open();
	}
		
	@Step
	public void selectRegion() {
		calMatchPage.radioSelectRegion();
    }
	
	@Step
	public void clickOrder() {
		calMatchPage.order();
	}
	
	@Step
	public void getOrderBy() {
		calMatchPage.choosePickUp();	
	}
	
	@Step
	public void yourAddress() {
	   calMatchPage.selectAddress();
	}
	
	@Step
	public void orderHere() {
		calMatchPage.clickOrderHere();
	}
	
	@Step
	public void takeYourOrder() {
		calMatchPage.takeOut();
	}
	
	@Step
	public void chooseBagel() {
		calMatchPage.checkBagelCalorie();
    }
	@Step
	public void chooseEverythingBagel() {
		calMatchPage.checkEverythingBagelCalorie();
	
	}	



}
