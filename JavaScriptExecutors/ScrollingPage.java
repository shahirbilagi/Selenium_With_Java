package Selenium_With_Java.JavaScriptExecutors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        //Driver is converted into JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Scroll By Pixels
        //js.executeScript("window.scrollBy(0,500)","");
        //System.out.println("Scrolled to: " + js.executeScript("return window.pageYOffset"));
        //Thread.sleep(2000);

        //Scroll by Element
        //WebElement ele=driver.findElement(By.xpath("//h5[normalize-space()='Customer Service']"));
        // js.executeScript("arguments[0].scrollIntoView();",ele);
        //System.out.println("Scrolled to: " + js.executeScript("return window.pageYOffset;"));
        //Thread.sleep(2000);

        //Scroll Till the end page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println("Scrolled to: " + js.executeScript("return window.pageYOffset;"));
        Thread.sleep(2000);
        driver.close();
    }
}
