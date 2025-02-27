package Selenium_With_Java.KeyBoardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Keyboard {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.diffchecker.com/");

        driver.findElement(By.xpath("//div[@aria-label='Original text input']")).sendKeys("Hello Shahir!");

        Actions action = new Actions(driver);

        // CMD + A (Select all)
        action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();

        // CMD + C (Copy)
        action.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).perform();

        //Tab for shifting
        action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        // CMD + V (Paste)
        action.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
