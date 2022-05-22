package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pages.FlightSearchPage;

public class SkyScannerSteps {

    FlightSearchPage flightSearchPage = new FlightSearchPage();



    @Given("^I launch the application$")
    public void i_launch_the_application() {

        flightSearchPage.launchApp();
    }

    @When("^I am in the \"([^\"]*)\" screen$")
    public void i_am_in_the_screen(String screen_name) {
        flightSearchPage.validateScreen(screen_name);
    }

    @Then("^I tap on \"([^\"]*)\"$")
    public void i_tap_on(String arg1){

    }

    @Then("^I enter departing from \"([^\"]*)\"$")
    public void i_enter_departing_from(String arg1) {

    }

    @Then("^I enter flying to \"([^\"]*)\"$")
    public void i_enter_flying_to(String arg1){

    }
}
