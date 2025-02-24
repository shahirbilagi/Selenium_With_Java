package Selenium_With_Java.All_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Get Title
        String title = driver.getTitle();
        System.out.println("Current Page Title: " + title);

        // Get Current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Get Window Handle
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window ID: " + windowHandle);

        // Wait until the element is clickable
        WebElement newArrivals = wait.until(ExpectedConditions.elementToBeClickable(By.className("name_rb_secondary_item")));

        // Click the element
        newArrivals.click();

        Thread.sleep(5000); // Allow time for the new window to open

        // Get all window handles
        Set<String> handles=driver.getWindowHandles();
        System.out.println("Handles: " + handles);

        // Close the new tab and switch back to the original window
        driver.quit();

    }
}
