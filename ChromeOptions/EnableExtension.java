package Selenium_With_Java.ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class EnableExtension {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        //Creating path for Selector Hub
        //Copy path based on your directory
        File file=new File("/Users/shahirbilagi/IdeaProjects/MainFile/src/Selenium_With_Java/ChromeOptions/SelectorsHub.crx");
        options.addExtensions(file);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.google.com");
        driver.getTitle();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);

    }
}
