package pages.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.MenuPageLocators;
import utilities.SeleniumDriver;

public class MenuActions {

	MenuPageLocators menuPageLocators=null;

	Map<String,WebElement> actions=new HashMap<String,WebElement>();
	
	public MenuActions() {
		
		this.menuPageLocators=new MenuPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), menuPageLocators);
	}
	
	public void menuActions(String action) {
		actions.put("Saved Cars", menuPageLocators.savedCars);
		actions.put("Saved Searches", menuPageLocators.savedSearches);
		actions.put("Your Garage", menuPageLocators.yourGarage);
		actions.put("SignIn", menuPageLocators.signIn);
		actions.put("Create Account", menuPageLocators.createAccount);
		
		actions.get(action).click();
	}
}
