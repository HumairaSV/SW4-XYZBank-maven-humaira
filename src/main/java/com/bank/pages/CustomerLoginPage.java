package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

By yourNameField = By.id("userSelect");
By loginButton = By.xpath("//button[text()= 'Login']");
By yourNameText = By.xpath("//label[text()= 'Your Name :']");

public void searchAndSelectCustomerName(String text){
    selectByVisibleTextFromDropDown(yourNameField, text);
}


public void clickOnLoginButton(){
    clickOnElement(loginButton);
}

public String verifyTextYourName(){
    return getTextFromElement(yourNameText);
}

}
