package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResultPage extends Utils{
    LoadProp loadProp =new LoadProp();
    private By _actualMassageAtEmailAFriend = By.xpath("//div[@class=\"result\"]");

    public void verifyUserShouldBeAbleToReferAFriendSuccessfully (){
        Assert.assertEquals(getTextFromElement(_actualMassageAtEmailAFriend), loadProp.getProperty("expectedemailfriendmassge"));
    }
}
