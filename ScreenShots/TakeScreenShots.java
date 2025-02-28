package Selenium_With_Java.ScreenShots;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class TakeScreenShots {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com");

        // 1. Full Page ScreenShot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        //Change the path accordingly with your directory
        File TargetFile = new File("/Users/shahirbilagi/IdeaProjects/MainFile/src/Selenium_With_Java/ScreenShots/Result.png");
        src.renameTo(TargetFile);


        // 2. For specific area to be taken screenshot
        WebElement area=driver.findElement(By.xpath("//div[@class='A8SBwf']"));
        File src1 = area.getScreenshotAs(OutputType.FILE);
        File TargetFile1 = new File("/Users/shahirbilagi/IdeaProjects/MainFile/src/Selenium_With_Java/ScreenShots/ResultArea.png");
        src1.renameTo(TargetFile1);

        // 3. For specific Logo
        WebElement logo=driver.findElement(By.xpath("//img[@alt='Google']"));
        File src2 = logo.getScreenshotAs(OutputType.FILE);
        File TargetFile2 = new File("/Users/shahirbilagi/IdeaProjects/MainFile/src/Selenium_With_Java/ScreenShots/ResultLogo.png");
        src2.renameTo(TargetFile2);
        Thread.sleep(2000);
        driver.close();
    }
}
