package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By bankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLoginTab = By.xpath("//button[text()= 'Customer Login']");


    public void clickOnBankManagerLoginTab(){
        clickOnElement(bankManagerLoginTab);
    }

    public void clickOnCustomerLoginTab(){
        clickOnElement(customerLoginTab);
    }

}
