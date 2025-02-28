package Selenium_With_Java.ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingChromeAutomation {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        // Help in removing displayed message of chrome is Automated
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.google.com");
        driver.getTitle();
        System.out.println(driver.getTitle());

    }
}
