package Selenium_With_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandlingBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.github.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Click on "Sign in"
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();

        // Get all window handles
        Set<String> windowIDs = driver.getWindowHandles();
        //Converts the Set into a List, so we can access window handles using indexes.
        List<String> windowList = new ArrayList<>(windowIDs);
        // Ensure a child window exists before switching

        if (windowList.size() > 1) {
            //Stores the first window (original page) as parentWindow.
            String parentWindow = windowList.get(0);

            //Stores the second window (newly opened) as childWindow.
            String childWindow = windowList.get(1);

            // Switch to child window
            driver.switchTo().window(childWindow);
            System.out.println("Child window opened: " + driver.getCurrentUrl());

            // Close child window and switch back to parent
            driver.close();
            driver.switchTo().window(parentWindow);
            System.out.println("Switched back to parent window: " + driver.getCurrentUrl());
        } else {
            System.out.println("No new window opened, Staying on the same page:" + driver.getCurrentUrl());
        }
        // Close the browser
        driver.quit();
    }
}
