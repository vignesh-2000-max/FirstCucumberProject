package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuPageLocators {

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/header/section/ep-modal/ul[2]/li[1]/a")
	public WebElement savedCars;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/header/section/ep-modal/ul[2]/li[2]/a")
	public WebElement savedSearches;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/header/section/ep-modal/ul[2]/li[3]/a")
	public WebElement yourGarage;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/header/section/ep-modal/div[2]/a[1]")
	public WebElement signIn;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/header/section/ep-modal/div[2]/a[2]")
	public WebElement createAccount;
	
	

}
