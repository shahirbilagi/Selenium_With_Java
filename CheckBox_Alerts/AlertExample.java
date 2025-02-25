package Selenium_With_Java.CheckBox_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // 1.Normal Alert with Ok button
      /*  driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
      */

        // 2.Confirmation Alert by OK or Cancel
     /*
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(3000);
        //driver.switchTo().alert().accept();//Using Ok Button
        driver.switchTo().alert().dismiss();//Using Cancel Button
        Thread.sleep(3000);
     */
        // 3.Prompt Alert(Input Box)
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello World");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(2000);
        driver.close();
    }
}
