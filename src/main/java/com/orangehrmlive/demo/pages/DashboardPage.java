package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
    WebElement dashboardText;
    public String getDashboardText() {
        log.info("Verify Dashboard Text"  + dashboardText.toString());
        return getTextFromElement(dashboardText);

    }


    //Click on User Profile logo
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    WebElement userProfileLogo;

    public void clickOnUserProfileLogo()
    {log.info("Click on User Profile Logo"  + userProfileLogo.toString());
        clickOnElement(userProfileLogo);
    }

    //Mouse hover on "Logout" and click
    @CacheLookup
    @FindBy(linkText = "Logout")
    WebElement logout;

    public void mouseHooverOnLogoutAndClick()

    {log.info("Mouse Hoover And Click On Logout"  + logout.toString());
        mouseHoverToElementAndClick(logout);
    }
}
