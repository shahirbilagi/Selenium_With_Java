package Selenium_With_Java.TestNG_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class GithubExample {
    @Test(priority = 1)
    void openBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        System.out.println("Github Successfully opened");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
