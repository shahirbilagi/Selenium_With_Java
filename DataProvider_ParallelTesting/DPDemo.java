package Selenium_With_Java.DataProvider_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo {
    WebDriver driver;

    @BeforeClass
    public void Login() {
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://github.com/login");
    }

    @Test(dataProvider = "DP")
    public void DPTest(String email, String password) throws InterruptedException {
        driver.findElement(By.id("login_field")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.xpath("//img[@class='avatar circle']")).click();
        Thread.sleep(3000);
        //driver.findElement(By.name("name attribute is not available for this element")).click();
        //driver.findElement(By.cssSelector("span[id=':rbh:--label']")).click();
        //Thread.sleep(3000);
    }

    @AfterClass
    public void Logout() {
        driver.close();
    }

    @DataProvider(name = "DP")
    String[][] Details() {
        return new String[][]{{"shahirbilagi43@gmail.com", "Shahir@43"}};
         // Add if more user authentication to be done also add logout functionality
    }

}
