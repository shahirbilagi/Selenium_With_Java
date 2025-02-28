package Selenium_With_Java.ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoExample {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        //Opens Chrome in incognito mode
        options.addArguments("--incognito");

        //Opens Chrome in maximized window
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.google.com");
        driver.getTitle();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
