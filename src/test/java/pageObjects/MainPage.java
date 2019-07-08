package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import dicetest.main.Init;

public class MainPage {
	
	WebDriver driver;
	
	
	@FindBy(id="rd1")
	WebElement cwodOption;
	
	@FindBy(id="rd2")
	WebElement nwodOption;
	
	@FindBy(id="jedynki")
	WebElement failureOptions;
	
	@FindBy(id="test")
	WebElement stNumber;
	
	@FindBy(id="test1")
	WebElement ikNumber;
	
	@FindBy(id="btn1")
	WebElement rollButton;
	
	public MainPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void cwodClicker() {
		cwodOption.click();
	}
	
	public void nwodClicker() {
		nwodOption.click();
	}
	
	public void failureClicker(String failureOption) {
		Select failureSelect = new Select(failureOptions);
		failureSelect.selectByValue(failureOption);
	}
	
	public void stFiller(String stValue) {
		stNumber.sendKeys(stValue);
	}
	
	public void ikFiller(String ikValue) {
		ikNumber.sendKeys(ikValue);
	}
	
	public void rollClicker() {
		rollButton.click();
	}
	
}
