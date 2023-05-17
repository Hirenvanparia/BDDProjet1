package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    AppleMacBookPro appleMacBookPro = new AppleMacBookPro();
    EmailAFriend emailAFriend = new EmailAFriend();

    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();



    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        homePage.clickOnRegisterButton();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        registerPage.enterRegistrationDetails();
    }

    @And("I enter required registration details without timestamp")
    public void i_enter_required_registration_details_without_timestamp() {
        registerPage.registerDetailsWithoutTimestamp();}

    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registerResultPage.verifyUserRegisteredSuccessfully();
    }

    @And("I am on login page")
    public void iAmOnLoginPage() {
        homePage.clickOnLoginButton();
    }

    @And("I enter valid email and password")
    public void iEnterValidEmailAndPassword() {
        loginPage.enterIDAndPassword();
    }

    @And("I click on Apple Mac Book Pro {int}Inch")
    public void iClickOnAppleMacBookProInch(int arg0) {
        homePage.clickOnAppleMacBookPro13InchName();
    }

    @And("I click email a friend")
    public void iClickEmailAFriend() {
        appleMacBookPro.productDetailPage();
    }

    @When("I enter friend's email and message")
    public void iEnterFriendSEmailAndMessage() {
        emailAFriend.verifyRegisteredUserCanReferAFriendSuccessfully();
    }

    @Then("I should email a friend successfully")
    public void iShouldEmailAFriendSuccessfully() {
        emailAFriendResultPage.verifyUserShouldBeAbleToReferAFriendSuccessfully();
    }
}

