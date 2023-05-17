package org.example;

import org.openqa.selenium.By;

public class EmailAFriend extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _friendEmail = By.className("friend-email");
    private By _personalMassage = By.id("PersonalMessage");
    private By _sendButton = By.name("send-email");
    public void verifyRegisteredUserCanReferAFriendSuccessfully() {



        //Type friend email
        typeText(_friendEmail, loadProp.getProperty("friendemail"));
        //Type your personal massage
        typeText(_personalMassage, loadProp.getProperty("personalmassage"));
        //click on send button
        clickOnElement(_sendButton);

    }
}

