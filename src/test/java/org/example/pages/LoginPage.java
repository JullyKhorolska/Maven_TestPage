package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends InitWebDriver {
    private By userNameInputField = By.xpath("//input[@placeholder='Username']");
    private By passwordInputField = By.xpath("//input[@placeholder='Password']");
    private By submitInput = By.xpath("//input[@type='submit']");
    public LoginPage(WebDriver webDriver){
        super(webDriver);
        if(!webDriver.getTitle().equals("Swag Labs")){
            throw new IllegalStateException("It's a wrong page!");
        }
    }
    public LoginPage enterUserName(String username){
        webDriver.findElement(userNameInputField).sendKeys(username);
        return this;
    }

     public LoginPage enterPassword(String password){
        webDriver.findElement(userNameInputField).sendKeys(password);
        return this;
    }

     public MainPage clickSubmitInput(){
        webDriver.findElement(userNameInputField).clear();
        return new MainPage(webDriver);
    }
}
