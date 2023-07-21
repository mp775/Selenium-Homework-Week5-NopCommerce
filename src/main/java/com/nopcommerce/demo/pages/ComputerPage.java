package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility
{

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computer;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;

    public void clickOnComputer() {
        sleep(1000);
        clickOnElement(computer);
        CustomListeners.test.log(Status.PASS,"Click on Computer");

    }

    public String getComputerText() {
        String actualComputerText = getTextFromElement(computerText);
        CustomListeners.test.log(Status.PASS,"Get Computer Text");
        return actualComputerText;
    }

}
