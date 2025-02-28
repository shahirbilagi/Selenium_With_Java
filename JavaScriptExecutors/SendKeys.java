package Selenium_With_Java.JavaScriptExecutors;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        //Normal Using with sendkeyss
        //driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Selenium With Java");

        //Using JavaScriptExecutor
        WebElement box = driver.findElement(By.xpath("//input[@placeholder='Search']"));

        //Driver is converted into JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','Selenium With Java')", box);
        Thread.sleep(2000);
        driver.close();
    }
}
