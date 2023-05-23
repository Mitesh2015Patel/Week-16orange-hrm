package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    //Enter Username
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement enterUsername;

    public void enterUsername(String username) {
        log.info("Enter Username" + enterUsername.toString());
        sendTextToElement(enterUsername, "Mehek Thakur");
    }

    //Select User Role
    //click On "Admin" Tab
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i")
    WebElement userRoleSelect;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]")
    WebElement selectAdmin;

    public void selectUserRole() throws InterruptedException {
        log.info("Select User Role" + userRoleSelect.toString());
        clickOnElement(userRoleSelect);
        Thread.sleep(1000);
        log.info("Select Admin" + selectAdmin.toString());
        clickOnElement(selectAdmin);
    }

    //Select Status
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div")
    WebElement statusSelect;

    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement selectDisable;

    public void selectStatusDisable() throws InterruptedException {
        log.info("Select Status" + statusSelect.toString());
        clickOnElement(statusSelect);
        Thread.sleep(1000);
        log.info("Select Disable" + selectDisable.toString());
        clickOnElement(selectDisable);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]")
    WebElement selectEnable;

    public void selectStatusEnable() throws InterruptedException {
        log.info("Select Status" + statusSelect.toString());
        clickOnElement(statusSelect);
        Thread.sleep(1000);
        log.info("Select Enable" + selectEnable.toString());
        clickOnElement(selectEnable);
    }

    //Click on "Search" Button
    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement clickSearch;

    public void clickSearchButton() {
        log.info("Click on Search" + clickSearch.toString());
        clickOnElement(clickSearch);
    }

    //Verify the User should be in Result list.
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]")
    WebElement verifyResult;

    public String verifyResultList() throws InterruptedException {
        log.info("Verify the Result List" + verifyResult.toString());
        Thread.sleep(1000);
        return getTextFromElement(verifyResult);
    }

    //Click on Check box
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement clickCheckbox;

    public void clickOnCheckbox() throws InterruptedException {
        log.info("Click on Checkbox" + clickCheckbox.toString());
        Thread.sleep(1000);
        clickOnElement(clickCheckbox);
    }

    //Click on Delete Button
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-cell-actions']/button[1]/i[1]")
    WebElement clickDelete;

    public void clickDeleteButton() throws InterruptedException {
        log.info("Click on Delete" + clickDelete.toString());
        clickOnElement(clickDelete);
        Thread.sleep(1000);
    }

    //Popup will display
    //Click on Ok Button on Popup
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-modal-footer']/button[2]")
    WebElement popUp;

    public void popUpClick() throws InterruptedException {
        log.info("Click on Popup" + popUp.toString());
        clickOnElement(popUp);
        Thread.sleep(1000);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]")
    WebElement verifyMsg;

    public void verifyMsgCheck() {
        log.info("Click on Message" + verifyMsg.toString());
        clickOnElement(verifyMsg);
    }

    //Click on "Search" Button
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-filter-area']/form[1]/div[2]/button[2]")
    WebElement searchBtn;

    public void SearchButtonDelete() {
        log.info("Click on Search Button Delete" + searchBtn.toString());
        clickOnElement(searchBtn);
    }

    //verify message "No Records Found"
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']")
    WebElement verifyNoRecord;

    public String VerifyNoRecordFound() {
        log.info("Verify The Text No Records Found" + verifyNoRecord.toString());
        return getTextFromElement(verifyNoRecord);
    }
}