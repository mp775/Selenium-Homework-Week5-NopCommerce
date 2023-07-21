package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerTest extends BaseTest {
    ComputerPage computerPage;
    DesktopsPage desktopsPage;

    @BeforeMethod
    public void inIT() {
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        sleep(2000);
        computerPage.clickOnComputer();
        Assert.assertEquals(computerPage.getComputerText(),"Computers", "Computer Text is not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        sleep(2000);
        computerPage.clickOnComputer();
        desktopsPage.clickOnDesktop();
        Assert.assertEquals(desktopsPage.getDesktops(), "Desktops","Desktops Text is not displayed");
    }

    @Test(dataProvider = "data-provider", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {

        computerPage.clickOnComputer();
        desktopsPage.clickOnDesktop();
        desktopsPage.clickOnProductName();
        desktopsPage.selectProcessorFromDropDown(processor, ram);
        desktopsPage.clickOnHDD(hdd);
        System.out.println(processor);
        desktopsPage.clickOnOS(os);
        desktopsPage.clickOnSoftware(software);
        desktopsPage.clickOnAddToCart();
        Assert.assertEquals(desktopsPage.getProductAddedNotification(), "The product has been added to your shopping cart","Product added notification is not displayed");
    }
}
