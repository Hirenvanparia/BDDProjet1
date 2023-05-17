package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.example.Utils.*;

public class RegisterPage extends Utils {
    private By _firstName = By.id("FirstName");

    private By _lastName = By.id("LastName");

    private By _dateOfBirth = By.name("DateOfBirthDay");

    private By _monthOfBirth = By.name("DateOfBirthMonth");

    private By _yearOfBirth = By.name("DateOfBirthYear");

    private By _email = By.name("Email");

    private By _password = By.id("Password");

    private By _confirmPassword = By.id("ConfirmPassword");

    private By _register = By.id("register-button");
    LoadProp loadProp =new LoadProp();

    public void enterRegistrationDetails(){
        // type Firstname
        typeText(_firstName, loadProp.getProperty("FirstName"));
        // type LastName
        typeText(_lastName, loadProp.getProperty("lastname"));
        //select date of birth
        selectElementsByText(_dateOfBirth, loadProp.getProperty("dateofbirth"));
        // select the Month of brith
        selectOptionByIndex(_monthOfBirth, Integer.parseInt(loadProp.getProperty("monthofbirth")));
        // select the year of the birth
        selectOptionByValue(_yearOfBirth, loadProp.getProperty("yearofbirth"));
        // type email Address
        typeText(_email, (loadProp.getProperty("email1")) + timestamp() + (loadProp.getProperty("email2")));
        // type password
        typeText(_password, loadProp.getProperty("password"));
        // type confirm password
        typeText(_confirmPassword, loadProp.getProperty("confirmpassword"));
        // click on register submit button
        clickOnElement(_register);

    }
    public void registerDetailsWithoutTimestamp() {
        //Enter First name
        typeText(_firstName, loadProp.getProperty("FirstName"));
        //Enter SecondName
        typeText(_lastName, loadProp.getProperty("lastname"));
        //Enter Email id
        typeText(_email, loadProp.getProperty("emailwithouttimestamp"));
        //enter Password
        typeText(_password, loadProp.getProperty("password"));
        //Confirm password
        typeText(_confirmPassword, loadProp.getProperty("confirmpassword"));
        //Click on Register submit button
        clickOnElement(_register);
    }

}


