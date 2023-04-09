package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsHomePageLocators {

	@FindBy(how = How.LINK_TEXT, using = "Cars for Sale")
	public WebElement carForSale;

	@FindBy(how = How.LINK_TEXT, using = "Research & Reviews")
	public WebElement researchAndReview;

	@FindBy(how = How.LINK_TEXT, using = "News & Videos")
	public WebElement newsAndVideos;

	@FindBy(how = How.LINK_TEXT, using = "Sell Your Car")
	public WebElement sellYourCar;

	@FindBy(how = How.LINK_TEXT, using = "Service & Repair")
	public WebElement serviceAndRepair;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/cars-global-header/header/section/nav/button/span[1]")
	public WebElement menuBar;

	@FindBy(how = How.LINK_TEXT, using = "Make")
	public WebElement clickMake;

	@FindBy(how = How.LINK_TEXT, using = "Body style")
	public WebElement clickBodyStyle;

	@FindBy(how = How.XPATH, using = "//*[@id=\"instant-offer-cta\"]/div[2]/ep-button//a")
	public WebElement getStarted;

	@FindBy(how = How.LINK_TEXT, using = "Advanced search")
	public WebElement advancedSearch;

	@FindBy(how = How.XPATH, using = "//*[@id=\"make-model-search-stocktype\"]")
	public WebElement selectMakeModelType;

	@FindBy(how = How.XPATH, using = "//*[@id=\"makes\"]")
	public WebElement selectMake;

	@FindBy(how = How.XPATH, using = "//*[@id=\"models\"]")
	public WebElement selectModel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"make-model-max-price\"]")
	public WebElement selectPrice;

	@FindBy(how = How.XPATH, using = "//*[@id=\"make-model-maximum-distance\"]")
	public WebElement selectDistance;

	@FindBy(how = How.XPATH, using = "//*[@id=\"make-model-zip\"]")
	public WebElement zipValue;
                                      
	@FindBy(how = How.XPATH, using = "//*[@id=\"by-make-tab\"]/div/div[7]/button")
	public WebElement clickMakeSearchButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"models\"]")
	public WebElement makeModelType;

	@FindBy(how = How.XPATH, using = "//*[@id=\"bodystyle-search-stocktype\"]")
	public WebElement selectBodyType;

	@FindBy(how = How.XPATH, using = "//*[@id=\"style\"]")
	public WebElement selectBodyStyle;

	@FindBy(how = How.XPATH, using = "//*[@id=\"bodystyle-max-price\"]")
	public WebElement selectBodyPrice;

	@FindBy(how = How.XPATH, using = "//*[@id=\"bodystyle-maximum-distance\"]")
	public WebElement selectBodyDistance;

	@FindBy(how = How.XPATH, using = "//*[@id=\"bodystyle-zip\"]")
	public WebElement bodyStyleZip;

	@FindBy(how = How.XPATH, using = "//*[@id=\"by-body-style-tab\"]/div/div[6]/button")
	public WebElement bodySearchButton;

}
