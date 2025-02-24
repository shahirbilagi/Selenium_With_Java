package Selenium_With_Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {
    private static WebElement search;

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://github.com/signup?source=login");

        //Locators by ID
        WebElement Username = driver.findElement(By.id("email"));
        Username.sendKeys("Shahir@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Shair@1234");

        //Locators by ID
        WebElement UN = driver.findElement(By.id("login"));
        UN.sendKeys("shahirbilagi");

        //Locator by LinkText
        driver.findElement(By.linkText("Sign in →")).click();
        driver.findElement(By.name("password")).sendKeys(".......");

        //Locator by CSS Selector
        driver.findElement(By.cssSelector("input.form-control input[name=login]")).sendKeys("shahirbilagi");
        driver.findElement(By.name("commit")).click();

    }
}
