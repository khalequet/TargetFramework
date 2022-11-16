package stepDef;

import base.Config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.createaccount_pageObj;

public class createaccount_stepDef extends Config {

    createaccount_pageObj CP = new createaccount_pageObj(driver);
    Faker faker = new Faker();

    @Given("i am at Target Homepage")
    public void iAmAtTargetHomepage() {
        CP.verifyHomePageTitle();
    }

    @And("i click on sign in button")
    public void iClickOnSignInButton() {
        CP.clickSignIn();
    }

    @And("i click on create account")
    public void iClickOnCreateAccount() {
        CP.clickcreateaccount();
    }

    @And("i enter valid email address")
    public void iEnterValidEmailAddress() {
        String firstname = faker.name().firstName().toLowerCase();
        String lastname = faker.name().lastName().toLowerCase();
        String domain = "@gmail.com";
        String email = firstname+lastname+domain;
        CP.enteremailAddress(email);

    }

    @And("i enter first name")
    public void iEnterFirstName() {
        String firstname = faker.name().firstName().toLowerCase();
        CP.enterfirstname(firstname);

    }

    @And("i enter last name")
    public void iEnterLastName() {
        String lastname = faker.name().lastName().toLowerCase();
        CP.enterlastname(lastname);

    }

    @And("i enter phone number")
    public void iEnterPhoneNumber() {
        String phonenumber =faker.phoneNumber().phoneNumber();
        CP.enterphonenumber(phonenumber);
    }

    @And("i enter create password")
    public void iEnterCreatePassword() {
        String password = faker.internet().password();
        CP.enterpassword(password);

    }



    //Hardcode
//
//    @And("i enter valid email address")
//    public void iEnterValidEmailAddress() {
//        CP.enteremailAddress();
//
//    }
//
//    @And("i enter first name")
//    public void iEnterFirstName() {
//
//        CP.enterfirstname();
//
//    }
//
//    @And("i enter last name")
//    public void iEnterLastName() {
//
//        CP.enterlastname();
//
//    }
//
//    @And("i enter phone number")
//    public void iEnterPhoneNumber() {
//
//     CP.enterphonenumber();
//    }
//
//    @And("i enter create password")
//    public void iEnterCreatePassword() {
//
//        CP.enterpassword();
//
//    }
//
//
    @When("i click on the create account button")
    public void iClickOnTheCreateAccountButton() {
        CP.clickaccountbuttontosignup();
    }

    @Then("i should be able to successfully create an account")
    public void iShouldBeAbleToSuccessfullyCreateAnAccount() {
        CP.verifycreatenewaccountSucessfull();
    }


    @And("i enter invalid email address")
    public void iEnterInvalidEmailAddress() {
        CP.enteremailAddress("tkhan000@gmail.com");

    }

    @And("i enter create invalid password")
    public void iEnterCreateInvalidPassword() {
        CP.enterpassword("Popcorn12!");
    }

    @Then("i should not be able to successfully create an account")
    public void iShouldNotBeAbleToSuccessfullyCreateAnAccount() {
        CP.UnSucessfull();
    }
}
