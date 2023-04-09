package pages.action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.ServicePageLocators;
import utilities.SeleniumDriver;

public class ServicePageActions {

	ServicePageLocators servicePageLocators=null;
	Select select=null;
	public ServicePageActions() {
		
		this.servicePageLocators=new ServicePageLocators();
	    PageFactory.initElements(SeleniumDriver.getDriver(), servicePageLocators);
	}
	
	public void chooseMake(String make) {
		
		select=new Select(servicePageLocators.chooseMake);
		select.selectByValue(make);
	}
	
	public void chooseModel(String model) {
		
		select=new Select(servicePageLocators.chooseModel);
		select.selectByValue(model);
	}	
	public void chooseYear(String year) {
		
		select=new Select(servicePageLocators.chooseYear);
		select.selectByValue(year);
	}
	public void clickSearchRecalBtn() {
		
		servicePageLocators.searchResultButton.click();
	}
}
