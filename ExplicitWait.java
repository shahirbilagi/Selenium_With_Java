package Selenium_With_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Using Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.github.com");
        driver.manage().window().maximize();

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hero_user_email")));
        element.sendKeys("test@gmail.com");
        //Using of Sleep
        Thread.sleep(5000);
        driver.close();
    }
}
