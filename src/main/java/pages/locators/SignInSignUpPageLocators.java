package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInSignUpPageLocators {

	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/cars-auth-modal/div[2]/ul/li[1]/a")
	public WebElement signInByFacebook;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/cars-auth-modal/div[2]/ul/li[2]/a")
	public WebElement signInByGoogle;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/cars-auth-modal/div[2]/ul/li[3]/a")
	public WebElement signInByApple;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"auth-modal-email\"]")
	public WebElement emailBox;
                                     
	@FindBy(how = How.XPATH, using = "//*[@id=\"auth-modal-current-password\"]")
	public WebElement passwordBox;
	                               
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/cars-auth-modal//ep-modal/form/ep-button//button")
	public WebElement submitButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"auth-modal-first-name\"]")
	public WebElement firtName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"auth-modal-last-name\"]")
	public WebElement lastName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"auth-modal-new-password\"]")
	public WebElement newPassword;
	

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/cars-auth-modal//ep-modal/form/ep-button//button")
	public WebElement createAccountBtn;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/cars-auth-modal//ep-modal/form/ep-button//button")
	public WebElement continueBtn;

}
