package com.intabella.step_definitions;

import com.intabella.pages.ForgotPasswordPage;
import com.intabella.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ForgotPassword_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();


    @When("user clicks Forgot your password? link")
    public void user_clicks_link() {
        loginPage.forgotYourPasswordLink.click();
    }

    @And("user lands on {string} page")
    public void user_lands_on_forgot_password_page(String pageVerifier) {
        Assert.assertEquals(pageVerifier, forgotPasswordPage.forgotPasswordPage.getText());
    }

    @And("user types {string}")
    public void userTypes(String userName) {
        forgotPasswordPage.userNameInputBox.sendKeys(userName);
    }

    @And("user clicks REQUEST button")
    public void user_clicks_button() {
        forgotPasswordPage.requestButton.click();
    }

    @Then("user changes his or her password")
    public void user_changes_his_him_password() {

        Assert.assertFalse(forgotPasswordPage.warningMessage.isDisplayed());
    }

    @And("user types username")
    public void userTypesUsername() {
    }


}
