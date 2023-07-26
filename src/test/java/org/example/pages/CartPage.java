package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends InitWebDriver{
    @FindBy(id = "#add-to-cart-sauce-labs-bike-light")
    private WebElement addToCardSauceLabsBikeLight;
    @FindBy(id = "#add-to-cart-sauce-labs-backpack")
    private WebElement addToCardSauceLabsBackPack;

    @FindBy(id = "#react-burger-menu-btn")
    private WebElement btnReactBurgerMenu;
    @FindBy(id = "#react-burger-menu-btn")
    private WebElement logOut;

      public BasketPage(WebDriver driver) {
        super(driver);
          PageFactory.initElements(webDriver,this);
    }
    public boolean textOfElementSauceLabsBackPack(){
        if(addToCardSauceLabsBackPack.getText().equals("Sauce Labs Backpack")) return true;
        else return false;
    }
    public boolean textOfElementSauceLabsBikeLight(){
        if(addToCardSauceLabsBikeLight.getText().equals("Sauce Labs Bike Light")) return true;
        else return false;
    }
    public BasketPage clickButtonRectBurger(){
        btnReactBurgerMenu.click();
          return this;
    }
    public BasketPage clickLogOut(){
        logOut.click();
        return this;
    }
}
