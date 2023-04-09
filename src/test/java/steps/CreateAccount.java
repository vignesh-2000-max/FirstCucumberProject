package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.action.HomePageActions;
import pages.action.MenuActions;
import pages.action.SignInUpProcess;
import utilities.SeleniumDriver;

public class CreateAccount {

	HomePageActions homePageActions=new HomePageActions();
	MenuActions action=new MenuActions();
	SignInUpProcess createAcc=new SignInUpProcess();
	
	@Given("user navigate to {string} website")
	public void user_navigate_to_website(String webUrl) {
		
		SeleniumDriver.openPage(webUrl);
		
	}

	@When("user Click Menu section")
	public void user_click_menu_section() {
		
		homePageActions.menuBar();
		
	}

	@Then("user Click {string} link")
	public void user_click_link(String link) {
		
		action.menuActions(link);
	}

	@Then("user enter email {string} and click next")
	public void user_enter_email_and_click_next(String email) throws InterruptedException {
		
		createAcc.createAccount(email);
	}

	@Then("user enter firstName {string} and lastName {string} and password {string}")
	public void user_enter_first_name_vignesh_and_last_name_g_and_password(String firstName,String lastName,String password) {

		createAcc.enterName(firstName, lastName, password);
		
	}

}
