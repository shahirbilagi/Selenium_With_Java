package Selenium_With_Java.KeyBoardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Control_Action {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.youtube.com");
        //Control action of Opening New Tab
        WebElement perform= driver.findElement(By.xpath("//ytd-topbar-logo-renderer[@id='logo']//div[@class='style-scope ytd-topbar-logo-renderer']//div"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND).click(perform).keyUp(Keys.COMMAND).perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
