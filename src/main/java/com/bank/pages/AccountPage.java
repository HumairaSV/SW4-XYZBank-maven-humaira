package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountPage extends Utility {

    By logoutTab = By.xpath("//button[text()= 'Logout']");
    By depositTab = By.xpath("//button[@ng-click= 'deposit()']");
    By withdrawalTab = By.xpath("//button[@ng-click= 'withdrawl()']");
    By amountField = By.xpath("//input[@placeholder= 'amount']");
    By depositButton = By.xpath("//button[text()= 'Deposit']");
    By depositSuccessfulMessage = By.xpath("//span[text()= 'Deposit Successful']");
    By withdrawButton = By.xpath("//button[text()= 'Withdraw']");
    By withdrawSuccessfulMessage = By.xpath("//span[text()= 'Transaction successful']");


    public boolean verifyLogoutTabisDisplayed() {
        Boolean element = driver.findElement(logoutTab).isDisplayed();
        return true;
    }

    public void clickOnLogOutButton() {
        clickOnElement(logoutTab);
    }


    public void clickOnDepositTab() {
        clickOnElement(depositTab);
    }

    public void clickOnWithdrawalTab() {
        clickOnElement(withdrawalTab);
    }

    public void enterAmount(String amt) {
        sendTextToElement(amountField, amt);
    }

    public void clickOnDepositButton() {
        clickOnElement(depositButton);
    }

    public String verifyDepositSuccessful() {
        return getTextFromElement(depositSuccessfulMessage);
    }

    public void clickOnWithdrawButton() {
        clickOnElement(withdrawButton);
    }

    public String verifyWithdrawSuccessful() {
        return getTextFromElement(withdrawSuccessfulMessage);
    }

}
