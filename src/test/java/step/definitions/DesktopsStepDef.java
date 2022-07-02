package step.definitions;

import java.util.List;


import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import page.objects.HomePage;
import utilities.UtilityClass;

public class DesktopsStepDef extends Base {
	DesktopsPage desktopsPage = new DesktopsPage();
	HomePage homePage = new HomePage();

	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		desktopsPage.clickOnDesktopTab();
		logger.info("user clicked on Desktops tab");
	}

	@When("User click on show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("user clicked on Show all Desktops");
	}

	@Then("User should see all items are present in Desktops page")
	public void user_should_see_all_items_are_present_in_desktops_page() {
		List<WebElement> items = desktopsPage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + " is present in this page");
		}
	UtilityClass.takeScreenShot();
	 try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
	}
	
	
	//2nd Scenario
	
	@When("User click ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	    desktopsPage.clickOnAddToCartHP();
	    logger.info("User Clicks on Add to Cart");
	}
	
	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopsPage.sendQuantity("1");
		logger.info("User send Quantity");
	}

	
	@When("User click add to Cart button HP")
	public void user_click_add_to_cart_button_HP() {
	  desktopsPage.clickOnAddToCartHP2();
	  logger.info("User Clicks on Add to Cart");
	}
	
	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
		Assert.assertTrue(desktopsPage.hpSuccessMsgIsDisplayed());
		logger.info("Success Message is Displayed");
		UtilityClass.takeScreenShot();
	}
	
	
	//3rd Scenario
	
	@When("User click ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	    desktopsPage.ClickOnAddToCartCanon();
	    logger.info("User Clicks on Add to Cart Canon");
	}
	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktopsPage.selectRedColor();
		logger.info("User Selects the Red Color");
	}
	
	@When("User select canon eos 5d quantity {string}")
	public void user_select_canon_eos_5d_canonQuantity(String string) {
		desktopsPage.sendCanonQuantity("1");
		logger.info("User send Quantity");
	}
	
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		Assert.assertTrue(desktopsPage.canonSuccessMsgIsDisplayed());
		logger.info("Success Message is Displayed");
		UtilityClass.takeScreenShot(); 
	}
	
	
	
	//4th Scenario
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	   desktopsPage.clickOnCanonEosIcon();
	   logger.info("User Clicks On Canon EOS Icon");
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	    desktopsPage.clickOnWriteReview();
	    logger.info("User Clicks On Write Review Link");
	}
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> reviewInfo = dataTable.asMaps(String.class, String.class);
		desktopsPage.writeNameForReveiw(reviewInfo.get(0).get("yourname"));
		desktopsPage.writeYourReview(reviewInfo.get(0).get("yourReview"));
		desktopsPage.selectRating();
	}
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
	    desktopsPage.clickOnContinueButton();
	    logger.info("User Clicks On Continue Button");
	}
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		Assert.assertTrue(desktopsPage.canonReviewSuccessMsg());
		logger.info("Canon Reveiw Success Message is Displayed");
		UtilityClass.takeScreenShot(); 
	}

}