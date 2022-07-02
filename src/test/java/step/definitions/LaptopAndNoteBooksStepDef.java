package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.LaptopAndNoteBooksPage;
import utilities.UtilityClass;

public class LaptopAndNoteBooksStepDef extends Base {

	LaptopAndNoteBooksPage lapAndNote = new LaptopAndNoteBooksPage();
	HomePage homePage = new HomePage();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		lapAndNote.clickOnLaptopAndNotebookTab();
		logger.info("User Clicks On Laptop & NoteBook Tab");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		lapAndNote.clickOnShowAllLaptopAndNotebookOption();
		logger.info("User Clicks On Show All Laptop &n NoteBook Option");
	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		lapAndNote.clickOnmacbookItem();
		logger.info("User Clicks on MacBook Item");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		lapAndNote.clickOnAddToCardButton();
		logger.info("User Clicks On Add to Cart Button");
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		String macbookAddedSuccessMsg = "You have added MacBook to your shopping cart!";
		lapAndNote.macbookAddToCardSuccessMsg(macbookAddedSuccessMsg);
		logger.info("User Can See the Success Message");
	}

	@Then("User should see ‘{string}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(String string) {
		String itemValueAndPrice = "1 tem(s)-602.00";
		lapAndNote.itemPriceAndValueOnCart(itemValueAndPrice);
		logger.info("User Can See the Matched Actual and Expected Success Message");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		lapAndNote.clickOnItemDisplayedOnCart2();
		logger.info("User Clicks on Cart Option");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		lapAndNote.clickOnXRedRemoveButton();
		logger.info("User Clicks on Red X Button");
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		String itemRemovedZeroValue = "0 item(s)";
		lapAndNote.itemRemovedFromCart(itemRemovedZeroValue);
		logger.info("Item is Removed From the Cart");
		UtilityClass.takeScreenShot();
	}

	/// Second Scenario

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		lapAndNote.clickOnComparisonMacBook();
		logger.info("User Clicks On Product Comparison Icon on MacBook");
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		lapAndNote.clickOnComparisonMacBookAir();
		logger.info("User clicks on Product Comparison Icon on MacBook Air");
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		String campraisonSccMsg = "Success: You have added MacBook Air to your product comparison!";
		lapAndNote.comparisonSuccessMsg(campraisonSccMsg);
		logger.info("User Can See You Have Added MacBook Air to Your Product Comparison Success Message");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		lapAndNote.clickOnProductComparisonLink();
		logger.info("User Clicks On Product Comparison Link");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(lapAndNote.comparisonTable());
		logger.info("Comparison Table is Displayed");
		UtilityClass.takeScreenShot();
	}

	// Third Scenario

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		lapAndNote.clickOnHearticonToAddSonyVaIOLaptopToWishList();
		logger.info("User Clicks On Heart to Add Sony VaIO Laptop to Wish List");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		Assert.assertTrue(lapAndNote.accountRequestBeforeAddToWishLish());
		logger.info("User Can See Login or Create account to Save Sony VaIO to Your Wish List");
		UtilityClass.takeScreenShot();
	}

	// Forth Scenario

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		lapAndNote.clickOnMacBookProIcon();
		logger.info("User Clicks On Mac Book Pro Ican");
	}

	@Then("User should see ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		Assert.assertTrue(lapAndNote.macBookProPriceValueTag());
		logger.info("User Can See MacBook Pro Tag Value Price");
		UtilityClass.takeScreenShot();
	}

}