package pages.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.NewsPageLocators;
import utilities.SeleniumDriver;

public class NewsPageActions {

	NewsPageLocators newsPageLocators=null;
	Map<String,WebElement> moreOptions=new HashMap<String,WebElement>();
	public NewsPageActions() {
		
		this.newsPageLocators=new NewsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), newsPageLocators);
	}
	
	public void expertReviews() {
		
		newsPageLocators.expertReviews.click();
	}
	
	public void multicarComparison() {
		
		newsPageLocators.multicarComparison.click();
	}
	
	public void clickVideos() {
		
		newsPageLocators.videosLink.click();
	}
	
	public void clickAwards() {
		
		newsPageLocators.awardsLink.click();
	}
	
	public void teslaModel() {
		
		newsPageLocators.teslaModel.click();
	}
	
	public void fordModel() {
		
		newsPageLocators.fordModel.click();
	}
	
	public void autoShows() {
		
		newsPageLocators.leasingLink.click();
	}
	
	public void moreOption(String link) {
		
		newsPageLocators.moreOption.click();
		moreOptions.put("Car Seat Checks", newsPageLocators.carSeatCheck);
		moreOptions.put("Best Commuter Cars", newsPageLocators.bestCommuterCars);
		moreOptions.put("Car Loan Tips", newsPageLocators.carLoanTips);
		moreOptions.put("Electric Cars", newsPageLocators.electricCars);
		moreOptions.put("Jenni Driven", newsPageLocators.jenniDriven);
		
		moreOptions.get(link).click();
		
	}
	
}
