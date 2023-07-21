package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement RegisterLInk;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement RegisterButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderFemale;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement day;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement month;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordRequired;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement RegisterText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyRegistration;


    public String getFirstNameErrorText() {
        String actualFirstNameError = getTextFromElement(firstNameError);
        CustomListeners.test.log(Status.PASS,"Get First Name Error Text");
        return actualFirstNameError;
    }

    public String getLastNameErrorText() {
        String actualLastNameError = getTextFromElement(lastNameError);
        CustomListeners.test.log(Status.PASS,"Get Last Name Error Text");
        return actualLastNameError;
    }

    public String getEmailErrorText() {
        String actualEmailError = getTextFromElement(emailError);
        CustomListeners.test.log(Status.PASS,"Get Email Error Text");
        return actualEmailError;
    }

    public void clickOnGender() {
        sleep(2000);
        clickOnElement(genderFemale);
        CustomListeners.test.log(Status.PASS,"Click On Gender");
    }

    public void setFirstName(String name) {
        sendTextToElement(firstName, name);
        CustomListeners.test.log(Status.PASS,"Set First Name");
    }

    public void setLastName(String name) {
        sendTextToElement(lastName, name);
        CustomListeners.test.log(Status.PASS,"Set Last Name");
    }

    public void selectFromDropDownDay(String day) {
        selectByVisibleTextFromDropDown(this.day, day);
        CustomListeners.test.log(Status.PASS,"Select From Dropdown Day");
    }

    public void selectFromDropDownMonth(String month) {
        selectByVisibleTextFromDropDown(this.month, month);
        CustomListeners.test.log(Status.PASS,"Select From Dropdown Month");
    }

    public void selectFromDropDownYear(String year) {
        selectByVisibleTextFromDropDown(this.year, year);
        CustomListeners.test.log(Status.PASS,"Select From Dropdown Year");
    }

    public void setEmail(String email) {
        sendTextToElement(this.email, email);
        CustomListeners.test.log(Status.PASS,"Set Email");
    }

    public String  getPasswordRequired() {
        String actualPasswordRequiredText = getTextFromElement(passwordRequired);
        CustomListeners.test.log(Status.PASS,"Get Password Required");
        return actualPasswordRequiredText;
    }

    public void setPassword(String Password) {
        sendTextToElement(this.password, Password);
        CustomListeners.test.log(Status.PASS,"Set Password");
    }

    public void setConfirmPassword(String confirmPassword) {
        sendTextToElement(this.confirmPassword, confirmPassword);
        CustomListeners.test.log(Status.PASS,"Set Confirm Password");
    }

    public void clickOnRegister() {
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS,"Click On Register");
    }

    public String getConfirmPasswordRequiredText() {
        String actualConfirmPasswordRequiredText  = getTextFromElement(confirmPasswordRequired);
        CustomListeners.test.log(Status.PASS,"Get Confirm Password Required Text");
        return actualConfirmPasswordRequiredText;
    }

    public void clickOnRegisterButton() {
        sleep(2000);
        clickOnElement(RegisterButton);
        CustomListeners.test.log(Status.PASS,"Click On Register Button");
    }

    public String getRegisterText() {
        String actualRegisterText = getTextFromElement(RegisterText);
        CustomListeners.test.log(Status.PASS,"Get Register Text");
        return actualRegisterText;
    }

    public void clickOnRegisterLink() {
        sleep(2000);
        clickOnElement(RegisterLInk);
        CustomListeners.test.log(Status.PASS,"Click On Register Link");
    }
}
