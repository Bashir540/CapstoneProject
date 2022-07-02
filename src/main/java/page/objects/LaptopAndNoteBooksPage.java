package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopAndNoteBooksPage extends Base {

	public LaptopAndNoteBooksPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopAndNotebookTab;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopAndNotebookOption;

	@FindBy(xpath = "//img[@alt='MacBook']")
	private WebElement macbookItem;

	@FindBy(id = "button-cart")
	private WebElement macbookAddToCart;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement macbookSuccessMsg;

	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement itemDisplayedOnCart;

	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement itemDisplayedOnCart2;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement removeButton;

	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement itemOnCart2;

	// Second Scenario

	@FindBy(xpath = "(//i[@class = 'fa fa-exchange'])[2]")
	private WebElement comparisonIconMacBook;

	@FindBy(xpath = "(//i[@class = 'fa fa-exchange'])[3]")
	private WebElement comparisonIconMacBookAir;

	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement comparisonSuccessMsg;

	@FindBy(xpath = "//a[text() = 'product comparison']")
	private WebElement productComprisonLink;

	@FindBy(xpath = "//div[@id = 'content']")
	private WebElement comparisonChart;

	// Third Scenario

	@FindBy(xpath = "//div[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement addToWishLish;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement accountRequestMsg;

	// Forth Scenario

	@FindBy(xpath = "//div[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[1]/h4/a")
	private WebElement macBookProIcon;

	@FindBy(xpath = "//div[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
	private WebElement priceValueTaginUI;

	public void clickOnLaptopAndNotebookTab() {
		laptopAndNotebookTab.click();
	}

	public void clickOnShowAllLaptopAndNotebookOption() {
		showAllLaptopAndNotebookOption.click();
	}

	public void clickOnmacbookItem() {
		macbookItem.click();
	}

	public void clickOnAddToCardButton() {
		macbookAddToCart.click();
	}

	public boolean macbookAddToCardSuccessMsg(String macbookAddedSuccessMsg) {
		String Msg = macbookSuccessMsg.getText();
		if (Msg.equalsIgnoreCase(macbookAddedSuccessMsg)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean itemPriceAndValueOnCart(String itemValueAndPrice) {
		String actualMsg = itemDisplayedOnCart.getText();
		if (actualMsg.equalsIgnoreCase(itemValueAndPrice)) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnItemDisplayedOnCart2() {
		itemDisplayedOnCart2.click();
	}

	public void clickOnXRedRemoveButton() {
		removeButton.click();
	}

	public boolean itemRemovedFromCart(String itemRemovedZeroValue) {
		String itemZeroValue = itemOnCart2.getText();
		if (itemZeroValue.equalsIgnoreCase(itemRemovedZeroValue)) {
			return true;
		} else {
			return false;
		}

	}

	public void clickOnComparisonMacBook() {
		comparisonIconMacBook.click();
	}

	public void clickOnComparisonMacBookAir() {
		comparisonIconMacBookAir.click();
	}

	public boolean comparisonSuccessMsg(String campraisonSccMsg) {
		String msg = comparisonSuccessMsg.getText();
		if (msg.equalsIgnoreCase(campraisonSccMsg)) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnProductComparisonLink() {
		productComprisonLink.click();
	}

	public boolean comparisonTable() {
		if (comparisonChart.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnHearticonToAddSonyVaIOLaptopToWishList() {
		addToWishLish.click();
	}

	public boolean accountRequestBeforeAddToWishLish() {
		if (accountRequestMsg.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public void clickOnMacBookProIcon() {
		macBookProIcon.click();
	}

	public boolean macBookProPriceValueTag() {
		if (priceValueTaginUI.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

}
