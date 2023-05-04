package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By verifyLinkTextHome = By.xpath("//button[normalize-space()='Home']");
    public String verifyLinkTextHome(){
        return getTextFromElement(verifyLinkTextHome);
    }
    By verifyTextXYZBank = By.xpath("//strong[contains(text(),'XYZ Bank')]");
    public String verifyTextXYZBank(){
        return getTextFromElement(verifyTextXYZBank);
    }
    By clickCustomerLoginLink = By.xpath("//button[@class='btn btn-primary btn-lg']");
    public void clickCustomerLoginLink(){
        clickOnElement(clickCustomerLoginLink);
    }
    By verifyYourNameText = By.xpath("//label[contains(text(),'Your Name :')]");
    public String verifyYourNameText() {
        return getTextFromElement(verifyYourNameText);
    }
    By clickOnHomeTab = By.xpath("//button[contains(text(),'Home')]");
    public void clickOnHomeTab(){
        clickOnElement(clickOnHomeTab);
    }
    By clickBankManagerLogin = By.xpath("//button[@ng-click='manager()']");
    public void clickBankManagerLogin(){
        clickOnElement(clickBankManagerLogin);
    }
    By verifyAddCustomerText = By.xpath("//button[@ng-class = 'btnClass1']");
    public String verifyAddCustomerText() {
        return getTextFromElement(verifyAddCustomerText);
    }

}
