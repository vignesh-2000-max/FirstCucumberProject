package pages.action;

import org.openqa.selenium.support.PageFactory;

import pages.locators.SignInSignUpPageLocators;
import utilities.SeleniumDriver;

public class SignInUpProcess {
	
	SignInSignUpPageLocators signInSignUpPageLocators=null;

	public SignInUpProcess() {
		this.signInSignUpPageLocators=new SignInSignUpPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), signInSignUpPageLocators);
	}
	
	public void signIn(String email, String password) {
		
		signInSignUpPageLocators.emailBox.sendKeys(email);
		signInSignUpPageLocators.passwordBox.sendKeys(password);
		signInSignUpPageLocators.submitButton.click();
		
	}
	
	public void createAccount(String email) throws InterruptedException {

		signInSignUpPageLocators.emailBox.sendKeys(email);
		Thread.sleep(1);
		signInSignUpPageLocators.continueBtn.click();
		
	}
	public void enterName(String firstName,String lastName,String Password) {
		
		signInSignUpPageLocators.firtName.sendKeys(firstName);
		signInSignUpPageLocators.lastName.sendKeys(lastName);
		signInSignUpPageLocators.newPassword.sendKeys(Password);
		signInSignUpPageLocators.createAccountBtn.click();
		
	}
}
