package Selenium_With_Java.KeyBoardAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Tab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //Switching to new Tab usin;g CTRL command
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");
        driver.quit();
    }
}
