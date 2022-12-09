package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();


    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("Testerhv");
        addCustomerPage.enterLastName("Smith");
        addCustomerPage.enterPostCode("M12 9AW");
        addCustomerPage.clickOnAddCustomerButton();
        Assert.assertTrue(addCustomerPage.verifyPopUpDisplayMessage().contains("Customer added successfully"), "Unable to confirm the pop up-Customer added successfully");
        addCustomerPage.clickOnOkOnPopUp();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOpenAccountTab();
        openAccountPage.searchAndSelectCustomerNameCreated("Hermoine Granger");
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
        Assert.assertTrue(openAccountPage.getTextFromAlert().contains("Account created successfully"), "Unable to verify pop up - account has been created successfully");
        openAccountPage.clickOnOkOnPopUp();
    }
    @Test
    public void customerShouldLoginAndLogoutSuccessfully(){
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchAndSelectCustomerName("Hermoine Granger");
        customerLoginPage.clickOnLoginButton();
        Assert.assertTrue(accountPage.verifyLogoutTabisDisplayed(), "Logout Tab is not displayed");
        accountPage.clickOnLogOutButton();
        Assert.assertTrue(customerLoginPage.verifyTextYourName().contains("Your Name"), "Unable to verify your name text");

    }

    @Test
    public void customerShouldDepositMoneySuccessfully(){
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchAndSelectCustomerName("Hermoine Granger");
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.enterAmount("100");
        accountPage.clickOnDepositButton();
        Assert.assertEquals(accountPage.verifyDepositSuccessful(), "Deposit Successful","Unable to deposit successfully");

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchAndSelectCustomerName("Hermoine Granger");
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnWithdrawalTab();
        accountPage.enterAmount("50");
        accountPage.clickOnWithdrawButton();
        Assert.assertEquals(accountPage.verifyWithdrawSuccessful(), "Transaction successful", "Unable to withdraw successfully");
    }
}
