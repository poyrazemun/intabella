package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

        public DashboardPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboard;

    @FindBy(xpath = "//*[@id=\"user-menu\"]/a")
    public WebElement userDropdown;

    @FindBy (xpath = "//*[@id=\"user-menu\"]/ul/li[4]/a")
    public WebElement logoutButton;

}
