package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerButton = By.className("ico-register");
    private By _logInButtonTag = By.className("ico-login");
    private By _appleMacBookPro13Inch = By.linkText("Apple MacBook Pro 13-inch");

    public void clickOnRegisterButton() {

        // click on register button
        clickOnElement(_registerButton);
    }


    public void clickOnLoginButton() {
        //connect with Xpath
        clickOnElement(_logInButtonTag);

    }

    public void clickOnAppleMacBookPro13InchName() {
        //connect with Xpath
        clickOnElement(_appleMacBookPro13Inch);
    }
}

