package Selenium_With_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Using Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.github.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("hero_user_email")).sendKeys("admin");
        //Using of Sleep
        Thread.sleep(5000);
        driver.close();
    }
}
