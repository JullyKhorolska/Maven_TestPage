package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaiterUtil {
    public static WebElement explicitWait(WebDriver webDriver, By by, int duration){
        WebDriverWait expliciteWait = new WebDriverWait(webDriver, Duration.ofSeconds(duration));
        return expliciteWait.until(webDriver1 -> webDriver1.findElement(by));
    }
}
