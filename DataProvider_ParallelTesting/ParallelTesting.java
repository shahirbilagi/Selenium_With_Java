package Selenium_With_Java.DataProvider_ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
    WebDriver driver;

    @BeforeClass
    @Parameters({"Browser","URL"}) //Run Using XMl File Because its webdriver is connected in xml file
    public void PageOpen(String br,String URL) throws InterruptedException {
        switch (br) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "IE":
                driver = new InternetExplorerDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(URL);
    }

    @Test
    public void geturl() {
        System.out.println("Page title is: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}
