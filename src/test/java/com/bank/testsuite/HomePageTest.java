package com.bank.testsuite;

import com.bank.pages.HomePage;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyHomePage() throws InterruptedException{
        Assert.assertEquals(homePage.verifyLinkTextHome(),"Home");
        Thread.sleep(2000);
        Assert.assertEquals(homePage.verifyLinkTextHome(),"Home");
        homePage.verifyTextXYZBank();
        Assert.assertEquals(homePage.verifyTextXYZBank(),"XYZ Bank");
        homePage.clickCustomerLoginLink();
        homePage.verifyYourNameText();
        Assert.assertEquals(homePage.verifyYourNameText(),"Your Name :");
        homePage.clickOnHomeTab();
        homePage.clickBankManagerLogin();
        homePage.verifyAddCustomerText();
        Assert.assertEquals(homePage.verifyAddCustomerText(),"Add Customer");
        homePage.clickOnHomeTab();

    }
}
