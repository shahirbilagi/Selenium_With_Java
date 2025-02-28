package Selenium_With_Java.JavaScriptExecutors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomIn_ZoomOut {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Driver is converted into JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.body.style.zoom='50%'"); // Setting Zoom Level 50%
        Thread.sleep(2000);

        js.executeScript("document.body.style.zoom='80%'"); // Setting Zoom Level 80%
        Thread.sleep(2000);

    }
}
