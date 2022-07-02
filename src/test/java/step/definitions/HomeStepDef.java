package step.definitions;

import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import utilities.UtilityClass;

public class HomeStepDef extends Base {

	HomePage homePage = new HomePage();

	@Given("User is on Retail Website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(homePage.isLogoDisplayed());
		logger.info("User is on Retail Website");
	}

	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.UserClickOnCurrency();
		logger.info("User Clicked On Currency");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.UserSelectEuroFromDropDown();
		logger.info("User Selected Euro from Drop Down");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(homePage.isEuroSignDisplayed());
		logger.info("Euro Sign is Displayed");
		UtilityClass.takeScreenShot();
	}

	// Second Scenario

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.userClicksOnShopingCart();
		logger.info("User Clicked On Empty Shoping Cart");
	}

	@Then("{string} message should display")
	public void message_should_display(String expectedMssg) {
		Assert.assertEquals(expectedMssg, homePage.emptyCartMsgDisplay());
		logger.info("User Can See Empty Cart Message");
		UtilityClass.takeScreenShot();
	}

}
