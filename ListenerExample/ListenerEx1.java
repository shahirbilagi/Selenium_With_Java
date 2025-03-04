package Selenium_With_Java.ListenerExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MyListener.class)
public class ListenerEx1 {
    WebDriver driver;
    @Test
    public void PageOpen() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.close();

    }

    @Test
    public void geturl() {
        System.out.println("Page title is: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Googlee");
    }

    @Test(dependsOnMethods = {"geturl"})
    public void close() {
        driver.quit();
    }
}
