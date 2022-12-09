package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By customerNameField = By.xpath("//select[@id='userSelect']");
    By currencyField = By.xpath("//select[@id='currency']");
    By processButton = By.xpath("//button[text()= 'Process']");


    public void searchAndSelectCustomerNameCreated(String text){
        selectByVisibleTextFromDropDown(customerNameField, text);
    }

    public void selectCurrency(String text){
        selectByVisibleTextFromDropDown(currencyField, text);
    }

    public void clickOnProcessButton(){
        clickOnElement(processButton);
    }

    public void verifyPopUpDisplayMessage(){
        getTextFromAlert();
    }

    public void clickOnOkOnPopUp(){
        acceptAlert();
    }

}
