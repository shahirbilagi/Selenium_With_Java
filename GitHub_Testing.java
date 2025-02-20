package Selenium_With_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub_Testing {
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open Google
            driver.get("https://www.google.com");

            // Find the search bar and enter a query
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Github.com");
            searchBox.submit();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
    }

