package Selenium_With_Java.CheckBox_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class CheckboxExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://testautomationpractice.blogspot.com/");
        //Checkbox select specific checkbox
        //driver.findElement(By.xpath("//label[@for='sunday']")).click();

        //Selecting all the checkbox
        List<WebElement> check= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for (WebElement checkbox : check) {
            checkbox.click();
        }
        Thread.sleep(3000);
        driver.close();
    }
}
