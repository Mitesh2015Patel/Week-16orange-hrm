package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUserPage.class.getName());

    public ViewSystemUserPage() {
        PageFactory.initElements(driver, this);
    }

    //click On "Admin" Tab
    @CacheLookup
    @FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
    WebElement adminClick;

    public void clickAdminLink()

    {log.info("Click on Admin"  + adminClick.toString());
        clickOnElement(adminClick);
    }

    //
    @CacheLookup
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
    WebElement verifySystemUserText;

    public String getSystemUserText()
    {log.info("Verify System User Text"  + verifySystemUserText.toString());
        return getTextFromElement(verifySystemUserText);
    }

    //
    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;

    public void clickAddButton()
    {log.info("Click on Add Button"  + addButton.toString());
        clickOnElement(addButton);
    }
    //
    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement verifyAddUser;

    public String AddUser()
    {log.info("Verify Add User"  + verifyAddUser.toString());
        return getTextFromElement(verifyAddUser);
    }
    //
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement selectAdminDrop;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]")
    WebElement selectAdmin;


    public void selectAdminRole() throws InterruptedException {
        log.info("Select Admin " + selectAdminDrop.toString());
        clickOnElement(selectAdminDrop);
        Thread.sleep(1000);
        log.info("Click on Admin" + selectAdmin.toString());
        clickOnElement(selectAdmin);
        Thread.sleep(1000);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement enterEmpName;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Goutam  Ganesh')]")
    WebElement enterEmpName1;

    public void enterEmp(String emp) throws InterruptedException {
        log.info("Enter Employee name" + enterEmpName.toString());
        sendTextToElement(enterEmpName, "G");
        Thread.sleep(1000);
        log.info("Enter Employee name1" + enterEmpName1.toString());
        clickOnElement(enterEmpName1);
    }

    //enter Username
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/input[1]")
    WebElement enterUsername;
    public void enterUser(String username)

    { log.info("Enter Username" + enterUsername.toString());
        sendTextToElement(enterUsername, "Mehek");
    }


    //Select Status "Disable"
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectStatus;


    @CacheLookup
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")
    WebElement selectDisable;


    public void selectDisableOption() throws InterruptedException {
        log.info("Select Status" + selectStatus.toString());
        clickOnElement(selectStatus);
        Thread.sleep(1000);
        log.info("Select Disable" + selectDisable.toString());
        clickOnElement(selectDisable);
        Thread.sleep(1000);
    }
    //Enter password
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement enterPassword;

    public void enterPass(String password)

    { log.info("Enter password" + enterPassword.toString());
        sendTextToElement(enterPassword, "Prime12345*");
    }

    //Enter Confirm Password
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement enterConfirmPassword;


    public void enterConfirmPass(String confirmPassword)

    { log.info("Enter confirm password" + enterConfirmPassword.toString());
        sendTextToElement(enterConfirmPassword, "Prime12345*");
    }
    //Click On "Save" Button

    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement clickOnSave;

    public void clickOnSaveButton() {
        log.info("Click on Save button" + clickOnSave.toString());
        clickOnElement(clickOnSave);
    }


}
