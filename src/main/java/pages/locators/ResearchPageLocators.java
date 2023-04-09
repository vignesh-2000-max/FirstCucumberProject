package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResearchPageLocators {

	@FindBy(how=How.LINK_TEXT,using="By model")
	public WebElement byModelLink;
	
	@FindBy(how=How.LINK_TEXT,using="By type")
	public WebElement byTypeLink;
	
	@FindBy(how=How.LINK_TEXT,using="By make")
	public WebElement byMakeLink;

	@FindBy(how=How.XPATH,using="//*[@id=\"make-select\"]")
	public WebElement selectMake;

	@FindBy(how=How.XPATH,using="//*[@id=\"model-select\"]")
	public WebElement selectModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"year-select\"]")
	public WebElement selectYear;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-search-tab\"]/div/div/div[4]/button")
	public WebElement clickResearch;


	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[1]/a")
	public WebElement clickSedanModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[2]/a")
	public WebElement clickCoupeModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[3]/a")
	public WebElement clickSUVModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[4]/a")
	public WebElement clickCrossoverModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[5]/a")
	public WebElement clickWagenModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[6]/a")
	public WebElement clickGreenCarModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[7]/a")
	public WebElement clickConvertibleModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[8]/a")
	public WebElement clickSportsCarModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[9]/a")
	public WebElement clickPickupModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[10]/a")
	public WebElement clickMiniVanModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[11]/a")
	public WebElement clickLuxuryCarModel;

	@FindBy(how=How.XPATH,using="//*[@id=\"by-type-tab\"]/div[3]/div/ul/li[12]/a")
	public WebElement clickCertifiedModel;

	
	
}
