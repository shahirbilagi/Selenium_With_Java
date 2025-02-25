package Selenium_With_Java.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DropDownExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //Implicit wait for loading of full page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement element= driver.findElement(By.xpath("//select[@id='country']"));
        //Using select commands for selecting particular element
        Select select = new Select(element);
        //select.selectByVisibleText("India");// Using VisibleText
        //select.selectByValue("france");//Using By Value method
        select.selectByIndex(3); //Using Index of the dropdown values
        Thread.sleep(3000);

        List<WebElement> options=select.getOptions();
        System.out.println("Total Number of Dropdowns are:"+options.size());//To get number of dropdowns
        System.out.println("List of Dropdowns are:");//To print the dropdown values
        for(WebElement option:options){
            System.out.println(option.getText());
        }

        driver.close();
    }
}
