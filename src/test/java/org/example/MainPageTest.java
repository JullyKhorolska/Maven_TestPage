package org.example;

import org.example.pages.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainPageTest extends InitDriver{
    public MainPage mainPage;
    @BeforeEach
    public void mainPage(){
        chromeDriver.get("https://www.saucedemo.com/inventory.html");
        mainPage = new MainPage(chromeDriver);
    }

    @Test
    public void addSauceLabsBackPackIntoCard(){
       Assertions.assertTrue(mainPage.addToCardSauceLabsBackPackElement()
                .addToCardSauceLabsBikeLightElement()
                .clickBasketLink().textOfElementSauceLabsBackPack());
    }
    @Test
    public void addSauceLabsBikeLightIntoCard(){
       Assertions.assertTrue(mainPage.addToCardSauceLabsBackPackElement()
                .addToCardSauceLabsBikeLightElement()
                .clickBasketLink().textOfElementSauceLabsBikeLight());
    }
    @Test
    public void sortByPriceLowtoHigh(){
        List<String> sortedString = new ArrayList<>();
        sortedString.add("$7.99");
        sortedString.add("$9.99");
        sortedString.add("$15.99");
        sortedString.add("$15.99");
        sortedString.add("$29.99");
        sortedString.add("$49.99");
        Assertions.assertEquals(mainPage.sortOfElementsOnMainPage().toString(),sortedString.toString());
    }

}
