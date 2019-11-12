package com.spartaglobal.demoQASite.demoQAPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DemoQASortingPage {

    private WebDriver driver;
    private String sortablePageLink = "https://demoqa.com/sortable/";
    private By itemElements = By.cssSelector(".ui-sortable-helper");

    public DemoQASortingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DemoQASortingPage goToSortablePage(){
        driver.navigate().to(sortablePageLink);
        return this;
    }

    public DemoQASortingPage itemElements(){
        WebElement element = driver.findElement(itemElements);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        return this;
    }

}



