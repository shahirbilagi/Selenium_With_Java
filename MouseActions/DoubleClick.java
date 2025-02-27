package Selenium_With_Java.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml5_ev_ondblclick");
       // WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        // Switch to frame1
        driver.switchTo().frame("iframeResult");
            WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));
            Actions actions = new Actions(driver);
            actions.doubleClick(button).build().perform();
        Thread.sleep(5000);
        driver.close();
    }
}
