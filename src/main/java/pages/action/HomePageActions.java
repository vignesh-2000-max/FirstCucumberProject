package pages.action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsHomePageLocators;
import utilities.SeleniumDriver;

public class HomePageActions {

	CarsHomePageLocators carsHomePageLocators = null;
	Select select = null;

	public HomePageActions() {

		this.carsHomePageLocators = new CarsHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsHomePageLocators);
	}

	public void researchAndReviews() {

		carsHomePageLocators.researchAndReview.click();
	}

	public void newsAndVideos() {

		carsHomePageLocators.newsAndVideos.click();
	}

	public void sellYourCars() {

		carsHomePageLocators.sellYourCar.click();
	}

	public void serviceAndRepair() {

		carsHomePageLocators.serviceAndRepair.click();
	}

	public void menuBar() {

		carsHomePageLocators.menuBar.click();
	}

	public void getStarted() {

		carsHomePageLocators.getStarted.click();
	}

	public void selectMakeUsedType(String type) {

		select = new Select(carsHomePageLocators.selectMakeModelType);
		select.selectByValue(type);
	}

	public void selectMakeType(String make) {

		select = new Select(carsHomePageLocators.selectMake);
		select.selectByValue(make);
	}

	public void selectModelType(String model) {

		select = new Select(carsHomePageLocators.selectModel);
		select.selectByValue(model);
	}

	public void selectPrice(String price) {

		select = new Select(carsHomePageLocators.selectPrice);
		select.selectByValue(price);
	}

	public void selectDistance(String distance) {

		select = new Select(carsHomePageLocators.selectDistance);
		select.selectByValue(distance);
	}

	public void clickMakeSearchBtn(String distance) {

		carsHomePageLocators.clickMakeSearchButton.click();
	}

	public void clickBodyStyleSection(String distance) {

		carsHomePageLocators.clickBodyStyle.click();
	}

	public void selectBodyModelUsedType(String type) {

		select = new Select(carsHomePageLocators.selectBodyType);
		select.selectByValue(type);
	}

	public void selectBodyModelStyleType(String style) {

		select = new Select(carsHomePageLocators.selectBodyStyle);
		select.selectByValue(style);
	}

	public void selectBodyModelPrice(String price) {

		select = new Select(carsHomePageLocators.selectBodyPrice);
		select.selectByValue(price);
	}

	public void selectBodyModelDistance(String distance) {

		select = new Select(carsHomePageLocators.selectBodyDistance);
		select.selectByValue(distance);
	}

	public void selectBodyModelSearchBtn() {

		carsHomePageLocators.bodySearchButton.click();
	}

	public void clickAdvancedSearch() {
      
		carsHomePageLocators.advancedSearch.click();
	}
}
