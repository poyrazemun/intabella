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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class InvalidLogin_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    String URL;


    @Then("user copies the URL")
    public void user_copies_the_url() {
        URL = Driver.getDriver().getCurrentUrl();
    }

    @Then("user log out")
    public void user_log_out() throws InterruptedException {
       quickLaunchpadPage.userDropdown.click();
      
       quickLaunchpadPage.logoutButton.click();
    }

    @Then("user paste the URL to the browser")
    public void user_paste_the_url_to_the_browser() {
        Driver.getDriver().get(URL);
    }

    @Then("user clicks login button without providing credentials")
    public void user_clicks_login_button_without_providing_credentials() throws InterruptedException {


        loginPage.loginButton.click();
    }

    @Then("user can not land on {string}")
    public void user_can_not_land_on(String string) throws InterruptedException {

        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

}
