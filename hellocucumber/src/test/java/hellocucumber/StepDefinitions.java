package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    private String today;
    private String actualAnswer;

    @Given("an example scenario")
    public void an_example_scenario() {
    }

    @When("all step definitions are implemented")
    public void all_step_definitions_are_implemented() {
    }

    @Then("the scenario passes")
    public void the_scenario_passes() {
    }

    @Given("today is {string}")
    public void today_is(String day) {
        this.today = day;
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
        this.today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        this.actualAnswer = IsItFriday.isItFriday(this.today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, actualAnswer);
    }
}

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}
