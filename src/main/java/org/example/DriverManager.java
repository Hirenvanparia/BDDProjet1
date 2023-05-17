package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browser");

    public void openBrowser() {

        if (browserName.equalsIgnoreCase("Chrome")) {
            // open Chrome browser
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();

        } else {
            System.out.println("Browser name is wrong or not implemented :" + browserName);
        }

        driver.get(loadProp.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.close();
    }
}
