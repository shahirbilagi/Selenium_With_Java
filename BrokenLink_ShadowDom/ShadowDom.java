package Selenium_With_Java.BrokenLink_ShadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/shadowdom");
        WebElement textt = driver.findElement(By.cssSelector("#my-btn"));
        System.out.println(textt.getText());
        driver.close();
    }
}
