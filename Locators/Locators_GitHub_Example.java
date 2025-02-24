package Selenium_With_Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;  // Import Duration

public class Locators_GitHub_Example {
    public static void main(String[] args)  {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.github.com");
        driver.manage().window().maximize();
        driver.getTitle();
        // Fix: Use Duration.ofSeconds()
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click on "Sign in"
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();

        // Wait until username field is visible & enter username
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_field"))).sendKeys("shahirbilagi43@gmail.com");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("Shahir@43");

        // Click the login button
        driver.findElement(By.name("commit")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("New"))).click();
        driver.findElement(By.cssSelector("input[@id=':ro:']")).sendKeys("New Repo");
        //driver.findElement(By.id(":ro:")).sendKeys("New Repo");

        System.out.println("Login Successful: " + driver.getTitle());
        // Close the browser
        driver.quit();
    }
}
