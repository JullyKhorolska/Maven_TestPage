package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CardTest extends InitDriver{
    public CardTest cardTest;

    public CardTest(WebDriver chromeDriver) {
        super();
    }

    @BeforeEach
    public void cardTest(){
        chromeDriver.get("https://www.saucedemo.com/inventory.html");
        cardTest = new CardTest(chromeDriver);
    }
    @Test
    public void elementsInCard(){
        chromeDriver.get("");
    }
}
