package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id = "prependedInput")
    public WebElement userNameBox;

    @FindBy (id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy (id = "remember_me")
    public WebElement rememberMeOnThisComputerCheckBox;

    @FindBy (linkText = "Forgot your password?")
    public WebElement forgotYourPasswordLink;

    @FindBy (xpath = "//div[.='Invalid user name or password.']")
    public WebElement messageAfterInvalidCredential;

    @FindBy
    public WebElement messageAfterAnEmptyField;



}
