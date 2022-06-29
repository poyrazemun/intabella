package com.intabella.step_definitions;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.LoginPage;
import com.intabella.pages.QuickLaunchpadPage;
import com.intabella.utilities.ConfigurationReader;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters {string} in the username box")
    public void user_enters_in_the_username_box(String string) {
        loginPage.userNameBox.sendKeys(string);
    }
    @When("user enters {string} in the password box")
    public void user_enters_in_the_password_box(String string) {
        loginPage.passwordBox.sendKeys(string);
    }
    @Then("user lands on  {string}")
    public void user_lands_on(String string) {

        loginPage.loginButton.click();
        if(string.equals(quickLaunchpadPage.quickLaunchpad.getText())){
            Assert.assertEquals(string,quickLaunchpadPage.quickLaunchpad.getText());
        }else{
            Assert.assertEquals(string,dashboardPage.dashboard.getText());
        }
    }




}
