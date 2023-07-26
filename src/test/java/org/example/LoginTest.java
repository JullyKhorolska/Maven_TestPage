package org.example;

import org.example.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends InitDriver{
    @Test
    public void verifyLoginPage(){
        chromeDriver.get("https://www.saucedemo.com/");

       new LoginPage(chromeDriver)
                .enterUserName("standard_user")
                .enterPassword("secret_sauce")
                .clickSubmitInput()
                .verifyListOfElementsIsDisplayed();
        WebElement productString = WaiterUtil.explicitWait(chromeDriver, By.xpath("//span[text() = 'Products']"),6);
        Assertions.assertTrue(productString.isDisplayed());
    }

}
