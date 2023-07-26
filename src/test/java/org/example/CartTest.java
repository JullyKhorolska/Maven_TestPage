package org.example;

import org.example.pages.CartPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CartTest extends InitDriver{
    public CartPage cartPage;
    @BeforeEach
    public void cartTest(){
        chromeDriver.get("https://www.saucedemo.com/cart.html");
        cartPage = new CartPage(chromeDriver);
    }
    @Test
    public void logOutTest(){
       cartPage.clickButtonRectBurger().clickLogOut();
        Assertions.assertEquals(chromeDriver.findElement(By.cssSelector("div.login_logo")).getText(),"Swag Labs");
    }
}
