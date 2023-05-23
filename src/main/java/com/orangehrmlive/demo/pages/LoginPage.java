package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    // Enter username
    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;

    public void enterUsername(String username)

    {log.info("Enter Username"  + usernameField.toString());
        sendTextToElement(usernameField, username);
    }

    //Enter password
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    public void enterPassword(String password)


    {log.info("Enter Password"  + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    //Click on Login Button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;
    public void clickLoginButton()
    {log.info("Click on Login Button"  + loginButton.toString());
        clickOnElement(loginButton);
    }

    //Click on User Profile logo
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
    WebElement logoHRForAll;

    public String getLogoHRForALL() {
        log.info("Verify logo HRForAll"  + logoHRForAll.toString());
        return getTextFromElement(logoHRForAll);

    }

    //Verify the text "Login Panel" is displayed
    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement loginPanelDisplayed;


    public String loginPanelDisplayed()

    {log.info("Verify Login Panel Displayed"  + loginPanelDisplayed.toString());
        return getTextFromElement(loginPanelDisplayed);
    }
}
