package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By firstNameField = By.xpath("//input[@placeholder = 'First Name']");
    By lastNameField = By.xpath("//input[@placeholder = 'Last Name']");
    By postCodeField = By.xpath("//input[@placeholder = 'Post Code']");
    By addCustomerButton = By.xpath("//button[text()= 'Add Customer']");

    public void enterFirstName(String text){
        sendTextToElement(firstNameField, text);
    }

    public void enterLastName(String text){
        sendTextToElement(lastNameField, text);
    }

    public void enterPostCode(String text){
        sendTextToElement(postCodeField, text);
    }

    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }

    public String verifyPopUpDisplayMessage(){
        return getTextFromAlert();
    }

    public void clickOnOkOnPopUp(){
        acceptAlert();
    }


}
