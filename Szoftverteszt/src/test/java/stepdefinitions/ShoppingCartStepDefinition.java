package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import steps.ShoppingCartStep;

public class ShoppingCartStepDefinition {

    public ShoppingCartStep shoppingCartStep = new ShoppingCartStep();

    @Given("user navigate to shopping page")
    public void user_navigate_to_shopping_page() {
        shoppingCartStep.navigateToShoppingPage();
    }
    @And("user adds new item to shopping cart")
    public void user_adds_new_item_to_shopping_cart() {
        shoppingCartStep.addItemToShoppingCart();
    }
    @When("user checks shopping cart")
    public void user_checks_shopping_cart() {
        shoppingCartStep.checkShoppingCart();
    }
    @Then("total payment is right")
    public void total_payment_is_right() {
        Assert.assertEquals(shoppingCartStep.totalPrice.getText(), "$18.51");
    }


}
