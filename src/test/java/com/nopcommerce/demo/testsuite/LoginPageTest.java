package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @BeforeMethod
    public void inIT() {
        loginPage = new LoginPage();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        loginPage.clickOnLoginLink();
        Assert.assertEquals(loginPage.getWelcomeText(), "Welcome, Please Sign In!", "Welcome Sign In message is not displayed");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        loginPage.clickOnLoginLink();
        loginPage.enterEmailId("Shweta123@gmail.com");
        loginPage.enterPassword("shwetasagar123");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getErrorMessage(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", "Error message validation failed");
    }

    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        sleep(2000);
        loginPage.clickOnLoginLink();
        loginPage.enterEmailId("Shwetashah123@gmail.com");
        loginPage.enterPassword("Shweta123");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getLogoutText(), "Log out", "Logout Text is not displayed");
    }

    @Test
    public void VerifyThatUserShouldLogOutSuccessFully() {
        sleep(2000);
        loginPage.clickOnLoginLink();
        loginPage.enterEmailId("Shwetashah123@gmail.com");
        loginPage.enterPassword("Shweta123");
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogoutLink();
        Assert.assertEquals(loginPage.getLoginInText(), "Log in", "Login In Text is not displayed");
    }
}