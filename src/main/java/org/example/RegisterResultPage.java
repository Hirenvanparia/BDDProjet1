package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.Utils.getTextFromElement;

public class RegisterResultPage extends Utils{

    private By _expectedRegistrationCompleteMsg = By.xpath("//div [@ class= result");
    LoadProp loadProp = new LoadProp();
    public void verifyUserRegisteredSuccessfully(){
        // gettext from Web element
        Assert.assertEquals(getTextFromElement(_expectedRegistrationCompleteMsg), loadProp.getProperty("expectedRegistrationResult"));


    }
}


