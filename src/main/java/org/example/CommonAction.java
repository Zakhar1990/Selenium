package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.example.Config.IMPLICIT_WAIT;
import static org.example.Config.PLATFORM_AND_BROWSER;

public class CommonAction {
    private static WebDriver driver = null;
    private CommonAction(){
    }

    public static WebDriver createDriver(){
        if(driver == null){
            switch (PLATFORM_AND_BROWSER){
                case "win_chrom":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver();
                default:
                    Assert.fail("Incorrect platform or broser name:" + PLATFORM_AND_BROWSER);
                     }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        }
        return driver;
    }
}
