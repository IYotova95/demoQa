package com.spartaglobal.demoQASite;

import com.spartaglobal.demoQASite.demoQAPages.DemoQAHomePage;
import com.spartaglobal.demoQASite.demoQAPages.DemoQASortingPage;
import org.openqa.selenium.WebDriver;

public class DemoQASite {

    private WebDriver driver;
    private DemoQAHomePage demoQAHomePage;
    private DemoQASortingPage demoQASortingPage;

    public DemoQASite(WebDriver driver) {
        this.driver = driver;
        this.demoQAHomePage = new DemoQAHomePage(driver);
        this.demoQASortingPage = new DemoQASortingPage(driver);
    }

    public DemoQAHomePage demoQAHomePage(){
        return demoQAHomePage;
    }

    public DemoQASortingPage demoQASortingPage(){
        return demoQASortingPage;
    }


}
