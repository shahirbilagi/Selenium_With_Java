package Selenium_With_Java.Handling_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        // Frame Locator
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

        // Switch to frame1
        driver.switchTo().frame(frame1);

        //  Locate and Input Text into the Field
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='mytext1']"));
        inputBox.sendKeys("Hello World");

        Thread.sleep(3000);
        inputBox.clear();
        Thread.sleep(3000);
        //  Switch back to the main page
        driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        // Switch to frame1
        driver.switchTo().frame(frame2);
        //  Locate and Input Text into the Field
        WebElement inputBox2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
        inputBox2.sendKeys("Hello World");
        Thread.sleep(5000);
        inputBox2.clear();
        Thread.sleep(3000);
        // Close the browser
        driver.quit();
    }
}
