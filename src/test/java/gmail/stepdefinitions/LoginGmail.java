package gmail.stepdefinitions;

import gmail.task.NavigateTo;
import gmail.questions.TheGmailPage;
import gmail.task.EnterWith;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class LoginGmail {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) go to the gmail page")
    public void go_to_the_gmail_page(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theGmailHomePage());
    }

    @When("she/he enter email {string} and password {string}")
    public void he_decided_Enter_Email_And_Password(String email, String pass) {
        withCurrentActor(
                EnterWith.user(email).password(pass)
        );
    }

    @Then("can see received messages")
    public void can_See_Received_Messages() {
        theActorInTheSpotlight().should(
                seeThat("Received messages", TheGmailPage.received(), equalTo("Recibidos"))
        );
    }
}
