package Selenium_With_Java.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/en-gb?route=common/home");
        driver.manage().window().maximize();

        WebElement Desktop= driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement Mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
        //Mouse hover function
        Actions action = new Actions(driver);
        action.moveToElement(Desktop).moveToElement(Mac).build().perform();
        Mac.click();
        Thread.sleep(3000);
        driver.close();
    }
}
