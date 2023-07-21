package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement getErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement loginOutLink;


    public void clickOnLoginButton() {
        sleep(2000);
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"Click on Login Button");
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS,"Enter Email Id into Email Text Field");
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS,"Enter Password into Password Text Field");
    }

    public void clickOnLoginLink() {
        sleep(2000);
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS,"Click on Login link");
    }

    public String getWelcomeText() {
        String actualWelcomeText = getTextFromElement(welcomeText);
        CustomListeners.test.log(Status.PASS,"Get Welcome Text");
        return actualWelcomeText;
    }

    public String getErrorMessage() {
        String actualErrorMsg = getTextFromElement(getErrorMessage);
        CustomListeners.test.log(Status.PASS,"Get Error Message");
        return actualErrorMsg;
    }

    public String getLogoutText() {
        String actualLogoutText = getTextFromElement(loginOutLink);
        CustomListeners.test.log(Status.PASS,"Get Logout Text");
        return actualLogoutText;
    }

    public String getLoginInText() {
        String actualLoginInText = getTextFromElement(loginLink);
        CustomListeners.test.log(Status.PASS,"Get LoginIn Text");
        return actualLoginInText;
    }

    public void clickOnLogoutLink() {
        sleep(2000);
        clickOnElement(loginOutLink);
        CustomListeners.test.log(Status.PASS,"Click on Logout Link");
    }
}
