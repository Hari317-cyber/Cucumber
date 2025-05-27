package StepDefinitions;

import CommonDriver.DefaultDriver;
import PageObjectModel.SearchProductsPOM;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class searchProducts {

    SoftAssert softAs = new SoftAssert();
    SearchProductsPOM searchProducts = new SearchProductsPOM(DefaultDriver.getDriver("chrome"));

    @Then("Click on {string} button")
    public void click_on_button(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        searchProducts.clickProduct();
    }

    @Then("Verify user is navigated to {string} page successfully")
    public void verify_user_is_navigated_to_page_successfully(String header) {
        System.out.println("verify_user_is_navigated_to_page_successfully");
        // Write code here that turns the phrase above into concrete actions
        //searchProducts.getHeaderInfo(header);
        softAs.assertTrue(searchProducts.getHeaderInfo(header),"Header TExt does not match");

    }

    @Then("Enter product name {string} in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button(String search) {
        // Write code here that turns the phrase above into concrete actions
        searchProducts.searchProduct(search);
    }

    @Then("Verify {string} is visible")
    public void verify_is_visible(String item) {
        // Write code here that turns the phrase above into concrete actions
        //searchProducts.filterResult(item);
        //softAs.assertEquals(searchProducts.filterResult(item),item,"Not a Match");
        System.out.println("-------------------------------------------------------------");
        System.out.println(item);
        String result= searchProducts.filterResult(item);
        softAs.assertEquals(result,item+1,"Not a Match");
        softAs.assertAll();
    }

    @Then("Add products to cart")
    public void add_products_to_cart() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        searchProducts.viewDetails();
    }

    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        searchProducts.clickCartMenu();
        //searchProducts.verifyShopping();
        softAs.assertEquals(searchProducts.verifyShopping(),"Shopping Cart","Not a Match");
        //softAs.assertAll();

    }
    @Then("Click {string} button corresponding to particular product")
    public void click_button_corresponding_to_particular_product(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        searchProducts.quantityDelete();

    }
    @Then("Verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        throw new io.cucumber.java.PendingException();
    }

    @Then("Click Cart button")
    public void clickCartButton() throws InterruptedException {
        searchProducts.clickCart();
    }
}
