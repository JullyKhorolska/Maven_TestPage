package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends InitWebDriver {
    @FindBy(css = "select.product_sort_container")
    WebElement selectOfElements;
    @FindBy(css=".inventory_container")
    WebElement listOfElements;
   public MainPage (WebDriver webDriver){
        super(webDriver);
       PageFactory.initElements(webDriver,this);
    }
    private By basketlink = By.cssSelector("a.shopping_cart_link");
    private By addToCardSauceLabsBikeLight = By.id("#add-to-cart-sauce-labs-bike-light");
    private By addToCardSauceLabsBackPack = By.id("#add-to-cart-sauce-labs-backpack");
    public List<String> sortOfElementsOnMainPage(){
        List<WebElement> prices = webDriver.findElements(By.xpath("//div[@class = 'inventory_item_price']"));
        List<String> sortedPrices = new ArrayList<>();
        for(int i=0;i< prices.size()-1;i++){
            sortedPrices.add(prices.get(i).getText());
        }
        return sortedPrices.stream().sorted().toList();
    }
    public boolean verifyListOfElementsIsDisplayed(){
        return listOfElements.isDisplayed();
    }
    public List<WebElement> sortLowToHighElements(){
        Select sortOfElements = new Select(selectOfElements);
        sortOfElements.selectByValue("lohi");
        return webDriver.findElements(By.cssSelector(".inventory_container")).stream().toList();
    }

    public MainPage addToCardSauceLabsBikeLightElement(){
        webDriver.findElement(addToCardSauceLabsBikeLight).click();
        return this;
    }
    public MainPage addToCardSauceLabsBackPackElement(){
        webDriver.findElement(addToCardSauceLabsBackPack).click();
        return this;
    }
    public CartPage clickBasketLink(){
        webDriver.findElement(basketlink).click();
        return new CartPage(webDriver);
    }
}
