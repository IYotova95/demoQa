package com.spartaglobal;

import static org.junit.Assert.assertTrue;

import com.spartaglobal.demoQASite.DemoQASite;
import com.spartaglobal.seleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    private static DemoQASite demoQASite;
    @BeforeClass
    public static void setup(){
        SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome","C:\\Users\\IYotova\\Downloads\\chromedriver_win32\\chromedriver.exe");
        demoQASite = new DemoQASite(chromeDriverConfig.getDriver());
    }

    @Test
    public void items(){
        demoQASite.demoQASortingPage().goToSortablePage().itemElements();
    }


}
