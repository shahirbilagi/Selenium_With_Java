package Selenium_With_Java.MouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        WebElement click=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        //Right click function and hover the copy and click again
        Actions actions=new Actions(driver);
        actions.contextClick(click).perform();
        driver.findElement(By.xpath("(//span[normalize-space()='Copy'])[1]")).click();
        Thread.sleep(3000);
        //Click on alert ok
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        driver.close();

    }
}
