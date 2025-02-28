package Selenium_With_Java.JavaScriptExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tus.io/demo");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //Scroll and find element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement ele=driver.findElement(By.xpath("//label[normalize-space()='Select a file you want to upload']"));
        js.executeScript("arguments[0].scrollIntoView();",ele);
        Thread.sleep(2000);

        //Upload the File
        WebElement File=driver.findElement(By.xpath("//input[@id='P0-0']"));
        File.sendKeys("/Users/shahirbilagi/Documents/Effigo Global/Internship Report 5th Feb.pdf");
        Thread.sleep(5000);
        driver.quit();
    }
}
