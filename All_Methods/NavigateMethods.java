package Selenium_With_Java.All_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.github.com");
        Thread.sleep(3000);
        driver.navigate().to("https://www.myntra.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //Navigating back
        driver.navigate().back();
        System.out.println("The Current page is:"+driver.getCurrentUrl());
        //Navigating Forward
        driver.navigate().forward();
        System.out.println("After Forward Navigation:"+driver.getCurrentUrl());
        //Navigating Refresh
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();

    }
}
