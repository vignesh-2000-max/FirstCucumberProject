package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewsPageLocators {

	@FindBy(how=How.LINK_TEXT,using="Expert Reviews")
	public WebElement expertReviews;

	@FindBy(how=How.LINK_TEXT,using="Multicar Comparison")
	public WebElement multicarComparison;

	@FindBy(how=How.LINK_TEXT,using="Videos")
	public WebElement videosLink;

	@FindBy(how=How.LINK_TEXT,using="Awards")
	public WebElement awardsLink;

	@FindBy(how=How.LINK_TEXT,using="Tesla Model Y")
	public WebElement teslaModel;

	@FindBy(how=How.LINK_TEXT,using="Ford F-150")
	public WebElement fordModel;

	@FindBy(how=How.LINK_TEXT,using="Auto Shows")
	public WebElement autoShows;

	@FindBy(how=How.LINK_TEXT,using="Leasing")
	public WebElement leasingLink;

	@FindBy(how=How.XPATH,using="//*[@id=\"ae-main-content\"]/div[2]/section[2]/div/div[1]/div[9]/button")
	public WebElement moreOption;

	@FindBy(how=How.LINK_TEXT,using="Car Seat Checks")
	public WebElement carSeatCheck;

	@FindBy(how=How.LINK_TEXT,using="Best Commuter Cars")
	public WebElement bestCommuterCars;

	@FindBy(how=How.LINK_TEXT,using="Car Loan Tips")
	public WebElement carLoanTips;

	@FindBy(how=How.LINK_TEXT,using="Electric Cars")
	public WebElement electricCars;

	@FindBy(how=How.LINK_TEXT,using="Jenni Driven")
	public WebElement jenniDriven;


}
