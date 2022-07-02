package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class DesktopsPage extends Base {

	public DesktopsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	@FindBy(tagName = "img")
	private List<WebElement> items;

	// Second Scenario

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]")
	private WebElement addToCartHP;

	@FindBy(xpath = "//*[@id='input-quantity']")
	private WebElement quantity;

	@FindBy(id = "button-cart")
	private WebElement addToCartHP2;

	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement hpSuccessMsg;

	// Third Scenario

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement addToCartCanon;

	@FindBy(id = "input-option226")
	private WebElement selectColorOption;

	@FindBy(xpath = "//*[@id=\"input-option226\"]/option[2]")
	private WebElement redColor;

	@FindBy(id = "input-quantity")
	private WebElement canonQuantity;

	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement canonSuccessMsg;

	// 4th Scenario

	@FindBy(xpath = "//*[@id=\'content\']/div[4]/div[2]/div/div[2]/div[1]/h4/a")
	private WebElement canonEosIcon;

	@FindBy(xpath = "//*[@id=\'content\']/div/div[2]/div[3]/p/a[2]")
	private WebElement writeReview;

	@FindBy(xpath = "//*[@id=\'input-name\']")
	private WebElement nameForReveiw;

	@FindBy(xpath = "//*[@id=\'input-review\']")
	private WebElement yourReview;

	@FindBy(xpath = "//*[@id=\'form-review\']/div[4]/div/input[5]")
	private WebElement ratingValue;

	@FindBy(xpath = "//*[@id=\'button-review\']")
	private WebElement continueReview;

	@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]")
	private WebElement reviewSuccessMsg;

	public void clickOnDesktopTab() {
		Actions action = new Actions(driver);
		action.moveToElement(desktopTab).build().perform();
	}

	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}

	public List<WebElement> elements() {
		List<WebElement> DesktopsItems = items;
		return DesktopsItems;

	}

	public void clickOnAddToCartHP() {
		addToCartHP.click();
	}

	public void sendQuantity(String string) {
		quantity.click();
		quantity.clear();
		quantity.sendKeys(string);
	}

	public void clickOnAddToCartHP2() {
		addToCartHP2.click();
	}

	public boolean hpSuccessMsgIsDisplayed() {
		if (hpSuccessMsg.isDisplayed())
			return true;
		else
			return false;
	}

	public void ClickOnAddToCartCanon() {
		addToCartCanon.click();
	}

	public void clickOnSelectColorOption() {
		selectColorOption.click();
	}

	public void selectRedColor() {
		redColor.click();
	}

	public void sendCanonQuantity(String string) {
		canonQuantity.click();
		canonQuantity.clear();
		canonQuantity.sendKeys(string);
	}

	public boolean canonSuccessMsgIsDisplayed() {
		if (canonSuccessMsg.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnCanonEosIcon() {
		canonEosIcon.click();
	}

	public void clickOnWriteReview() {
		writeReview.click();
	}

	public void writeNameForReveiw(String yourName) {
		nameForReveiw.click();
		nameForReveiw.sendKeys(yourName);
	}

	public void writeYourReview(String yourReveiwValue) {
		yourReview.click();
		yourReview.sendKeys(yourReveiwValue);
	}

	public void selectRating() {
		ratingValue.click();
	}

	public void clickOnContinueButton() {
		continueReview.click();
	}

	public boolean canonReviewSuccessMsg() {
		if (reviewSuccessMsg.isDisplayed())
			return true;
		else
			return false;
	}

}