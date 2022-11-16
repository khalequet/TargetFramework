package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.createaccount_pageObj;
import pageObject.login_pageObj;

public class login_stepDef extends Config {

    login_pageObj LP = new login_pageObj(driver);


    @Given("i am at Target Homepage for SignIn purpose")
    public void iAmAtTargetHomepageForSignInPurpose() {
        LP.verifyTargetHomepageforloginpurpose();
    }

    @And("i click on sign in link from the Target homepage")
    public void iClickOnSignInLinkFromTheTargetHomepage() {
       LP.iclickonsigninlinkfirst();
    }


    @And("i click on sign in button to navigate to sign in page")
    public void iClickOnSignInButtonToNavigateToSignInPage() {
        LP.navigatetosgninpage();

    }

    @And("i enter or phone number to sign in to Target")
    public void iEnterOrPhoneNumberToSignInToTarget() {
        LP.enteremailorphonenumber();
    }

    @And("i enter password to sign in to Target")
    public void iEnterPasswordToSignInToTarget() {
        LP.enterpasswordforSignIn();
    }

    @When("i click on SignIn button")
    public void iClickOnSignInButton() {
        LP.clickonSignINbutton();
    }


    @And("i enter invalid email or phone number to sign in to Target")
    public void iEnterInvalidEmailOrPhoneNumberToSignInToTarget() {
        LP.enterinvalidemailorphonenumber();
    }

    @Then("i should be able to Sign in successfully")
    public void iShouldBeAbleToSignInSuccessfully() {
        LP.verifyloginwassuccessfull();

    }
    @Then("i should not be able to Sign in successfully")
    public void iShouldNotBeAbleToSignInSuccessfully() {
        LP.verifyloginwasNOTssuccessfull();

    }
}
