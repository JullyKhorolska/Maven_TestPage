package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends InitWebDriver{
    @FindBy(id = "#add-to-cart-sauce-labs-bike-light")
    private WebElement addToCardSauceLabsBikeLight;
    @FindBy(id = "#add-to-cart-sauce-labs-backpack")
    private WebElement addToCardSauceLabsBackPack;

    @FindBy(id = "#react-burger-menu-btn")
    private WebElement btnReactBurgerMenu;
    @FindBy(id = "#react-burger-menu-btn")
    private WebElement logOut;

      public CartPage(WebDriver driver) {
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
    public CartPage clickButtonRectBurger(){
        btnReactBurgerMenu.click();
          return this;
    }
    public LoginPage clickLogOut(){
        logOut.click();
        return new LoginPage(webDriver);
    }
}
