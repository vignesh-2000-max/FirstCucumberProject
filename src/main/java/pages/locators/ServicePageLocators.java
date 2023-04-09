package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServicePageLocators {


	@FindBy(how = How.XPATH, using = "//*[@id=\"make-select\"]")
	public WebElement chooseMake;

	@FindBy(how = How.XPATH, using = "//*[@id=\"model-select\"]")
	public WebElement chooseModel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"year-select\"]")
	public WebElement chooseYear;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ae-main-content\"]/div[2]/section[2]/div/form/button")
	public WebElement searchResultButton;

}
