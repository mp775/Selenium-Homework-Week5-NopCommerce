package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {

    RegisterPage registerPage;

    @BeforeMethod
    public void inIT() {
        registerPage = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        sleep(2000);
        registerPage.clickOnRegisterLink();
        Assert.assertEquals(registerPage.getRegisterText(), "Register","Register Text is not displayed");
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        sleep(2000);
        registerPage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        Assert.assertEquals(registerPage.getFirstNameErrorText(), "First name is required.","First name is required error message not displayed");
        Assert.assertEquals(registerPage.getLastNameErrorText(), "Last name is required.","Last name is required error message is not displayed");
        Assert.assertEquals(registerPage.getEmailErrorText(), "Email is required.","Email is required error message is not displayed");
        Assert.assertEquals(registerPage.getPasswordRequired(), "Password is required.","Password is required error message is not displayed");
        Assert.assertEquals(registerPage.getConfirmPasswordRequiredText(), "Password is required.","Password is required error message is not displayed");
    }

    @Test
    public void VerifyThatUserShouldCreateAccountSuccessfully() {
        registerPage.clickOnRegisterLink();
        registerPage.clickOnGender();
        registerPage.setFirstName("Shweta");
        registerPage.setLastName("Shah");
        registerPage.selectFromDropDownDay("28");
        registerPage.selectFromDropDownMonth("September");
        registerPage.selectFromDropDownYear("1983");
        registerPage.setEmail("shweta.shah123@gmail.com");
        registerPage.setPassword("shweta123456");
        registerPage.setConfirmPassword("shweta123456");
        registerPage.clickOnRegister();
    }
}
