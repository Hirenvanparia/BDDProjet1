package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _logInButton = By.xpath("//button[contains(text(),'Log in')]");
    LoadProp loadProp =new LoadProp();
    public void enterIDAndPassword() {

        //Enter Email id
        typeText(_email, loadProp.getProperty("email"));
        //Enter Password
        typeText(_password, loadProp.getProperty("password"));
        //click on Log in Button
        clickOnElement(_logInButton);
    }
}
