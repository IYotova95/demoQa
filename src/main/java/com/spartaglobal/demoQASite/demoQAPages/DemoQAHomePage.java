package com.spartaglobal.demoQASite.demoQAPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAHomePage {

    private WebDriver driver;
    private String homePageURL = "https://demoqa.com/";
    private By sortingLink = By.linkText("Sortable");

    public DemoQAHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DemoQAHomePage goToDemoHomePage(){
        driver.navigate().to(homePageURL);
        return this;
    }

    public DemoQAHomePage clickSortedLink(){
        driver.findElement(sortingLink).click();
        return this;
    }

    public DemoQAHomePage closeDriver(){
        driver.close();
        return this;
    }

}
