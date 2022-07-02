package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class HomePage extends Base {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"logo\"]/h1/a")
	private WebElement logo;

	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button")
	private WebElement currency;

	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/ul/li[1]/button")
	private WebElement euro;

	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement euroSign;

	// Second Scenario

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[4]")
	private WebElement shopingCartElement;

	@FindBy(xpath = "(//*[@id=\"content\"])[1]/p")
	private WebElement msgDisplayElement;

	public void UserClickOnCurrency() {
		currency.click();
	}

	public void UserSelectEuroFromDropDown() {
		euro.click();
	}

	public boolean isEuroSignDisplayed() {
		if (euroSign.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public void userClicksOnShopingCart() {
		shopingCartElement.click();
	}

	public String emptyCartMsgDisplay() {
		return msgDisplayElement.getText();
	}

	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}

}