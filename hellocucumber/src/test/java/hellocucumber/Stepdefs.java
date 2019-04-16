package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;


public class Stepdefs {
    private String actualAnswer;
    private String search;
    private String color;
    private String brand;
    private String brakes;


    @Given("^I look for \"([^\"]*)\"$")
    public void searching_for(String search) {
        this.search = search;
    }

    @When("^I hit search$")
    public void i_click_search_button() {
        this.actualAnswer = IsItMyBike.isItMyBike(search);
    }

    @Then("^result should be \"([^\"]*)\"$")
    public void i_should_find(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Given("there is bike with {string}")
    public void i_see_bike_with(String string) {
       brakes = string;
    }

    @Given("it's color is {string}")
    public void it_has_a_color(String string) {
        color = string;
    }

    @Given("it's brand is {string}")
    public void it_is_a(String string) {
        brand = string;
    }

    @When("I want to buy")
    public void i_decide_whether_to_buy() {
        this.actualAnswer = IsItMyBike.iWantThatBike(brakes,color,brand);
    }

    @Then("I say {string}")
    public void my_answer_is(String expectedDecision) {
        assertEquals(expectedDecision, actualAnswer);
    }




}

