package dojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import java.util.List;

public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void who_wants_to_buy_a_drink(String name) {
        order = new Order();
        order.declareOwner(name);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for(String name) {
        order.declareTarget(name);
    }

    @When("a message saying {string} is added")
    public void a_message_saying_is_added(String message) {
        order.getCocktails().add(message);
    }

    @Then("there is no cocktail in the order")
    public void there_is_no_cocktail_in_the_order() {
        List<String> cocktails = order.getCocktails();
        assertTrue(cocktails.isEmpty());
    }

    @Then("there is {int} cocktails in the order")
    public void there_is_cocktails_in_the_order(int count) {
        List<String> cocktails = order.getCocktails();
        assertEquals(count, cocktails.size());
    }

    @Then("the ticket must say {string}")
    public void the_ticket_must_say(String message) {
        List<String> cocktails = order.getCocktails();
        assertEquals(message, "From " + order.getOwner() + " to " + order.getTarget() + ": " + cocktails.get(0));
    }
}