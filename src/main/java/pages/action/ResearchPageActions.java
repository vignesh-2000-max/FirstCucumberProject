package pages.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.ResearchPageLocators;
import utilities.SeleniumDriver;

public class ResearchPageActions {

	ResearchPageLocators researchPageLocators = null;
	Select select1 = null;
	Map<String, WebElement> byTypeResearch = new HashMap<String, WebElement>();

	public ResearchPageActions() {

		this.researchPageLocators = new ResearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), researchPageLocators);
	}

	public void researchByModel() {

		researchPageLocators.byModelLink.click();
	}

	public void selectMakeByModel(String make) {

		select1 = new Select(researchPageLocators.selectMake);
		select1.selectByValue(make);
	}

	public void selectModelByModel(String model) {

		select1 = new Select(researchPageLocators.selectModel);
		select1.selectByValue(model);
	}

	public void selectYearByModel(String year) {

		select1 = new Select(researchPageLocators.selectYear);
		select1.selectByValue(year);
	}

	public void clickResearchButton() {

		researchPageLocators.clickResearch.click();
	}

	public void researchByType() {

		researchPageLocators.byTypeLink.click();
	}
	
	public void clickResearchType(String type) {

		byTypeResearch.put("Sedan", researchPageLocators.clickSedanModel);
		byTypeResearch.put("Coupe", researchPageLocators.clickCoupeModel);
		byTypeResearch.put("SUV", researchPageLocators.clickSUVModel);
		byTypeResearch.put("Crossover", researchPageLocators.clickCrossoverModel);
		byTypeResearch.put("Wagon", researchPageLocators.clickWagenModel);
		byTypeResearch.put("Green", researchPageLocators.clickGreenCarModel);
		byTypeResearch.put("Convertible", researchPageLocators.clickConvertibleModel);
		byTypeResearch.put("Sports", researchPageLocators.clickSportsCarModel);
		byTypeResearch.put("Pickup Truck", researchPageLocators.clickPickupModel);
		byTypeResearch.put("MiniVan", researchPageLocators.clickMiniVanModel);
		byTypeResearch.put("Luxury", researchPageLocators.clickLuxuryCarModel);
		byTypeResearch.put("Certified", researchPageLocators.clickCertifiedModel);
		
		byTypeResearch.get(type).click();
	}

	public void researchByMake() {
		
		researchPageLocators.byMakeLink.click();
	}
	
}
