package com.intabella.step_definitions;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.LoginPage;
import com.intabella.pages.QuickLaunchpadPage;
import com.intabella.utilities.ConfigurationReader;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    DashboardPage dashboardPage = new DashboardPage();
    Actions actions = new Actions(Driver.getDriver());


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
        loginPage.loginButton.click();

    }

    @Then("user lands on  {string}")
    public void user_lands_on(String string) {

        dashboardPage.waitUntilLoaderScreenDisappear();
        Assert.assertEquals(string, dashboardPage.dashboard.getText());
    }


    @When("user enters {string} with spaces before it and after it")
    public void userEntersWithSpacesBeforeItAndAfterIt(String string) {
        loginPage.userNameBox.sendKeys("     " + string + "        ");
    }

    @Then("the visibility of password text should be invisible")
    public void theVisibilityOfPasswordTextShouldBeInvisible() {
        String expectedAttribute = "password";
        Assert.assertEquals(expectedAttribute, loginPage.passwordBox.getAttribute("type"));
    }

    @And("user tries to copy the text from password box")
    public void userTriesToCopyTheTextFromPasswordBox() {
        actions.moveToElement(loginPage.passwordBox).doubleClick().build().perform();

        loginPage.passwordBox.sendKeys(Keys.chord(Keys.CONTROL, "c"));

    }

    @Then("user should not be able to paste the {string}")
    public void userShouldNotBeAbleToPasteThe(String string) {
        loginPage.userNameBox.sendKeys(Keys.chord(Keys.CONTROL, "v"));
        Assert.assertNotEquals(string, loginPage.userNameBox.getAttribute("value"));
    }

    @When("user sees the Remember me on this computer checkbox")
    public void userSeesTheRememberMeOnThisComputerCheckbox() throws InterruptedException {

        Assert.assertTrue(loginPage.rememberMeOnThisComputerCheckBox.isDisplayed());

    }

    @Then("user should be able to click on it")
    public void userClicksOnIt() {

        Assert.assertEquals(null, loginPage.rememberMeOnThisComputerCheckBox.getAttribute("disabled"));

    }

    @When("user clicks on Username input box")
    public void userClicksOnUsernameInputBox() {
        loginPage.userNameBox.click();
    }


    @And("user writes valid {string} clicks Enter, writes valid {string} clicks Enter")
    public void userWritesValidClicksEnterWritesValidClicksEnter(String username, String password) {

        loginPage.userNameBox.sendKeys(username + Keys.ENTER + password + Keys.ENTER);


    }
}
