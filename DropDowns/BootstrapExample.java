package Selenium_With_Java.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootstrapExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        List<WebElement> element= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println("The Total Number of Elements are:"+element.size());
        Thread.sleep(3000);
        System.out.println("List of elements are:");
        for(WebElement el:element){
            System.out.println(el.getText());
        }
        driver.close();
    }
}
