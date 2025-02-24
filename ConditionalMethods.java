package Selenium_With_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://www.skechers.in/");

        // IsDisplay Conditional Methods
        WebElement logo=driver.findElement(By.xpath("//img[@class='sketchers-logo']"));
        System.out.println("Display of Logo:"+logo.isDisplayed());

        // IsDisplay Conditional Methods direct allocation
        boolean logoo=driver.findElement(By.xpath("//img[@class='sketchers-logo']")).isDisplayed();
        if(logo.isDisplayed()){
            System.out.println("Logo is Displayed");
        }
        // IsEnabled Conditional Methods
        boolean searchbox=driver.findElement(By.xpath("//div[@class='d-none d-lg-block']//input[@placeholder='Search']")).isEnabled();
        if(searchbox){
            System.out.println("Searchbox is Enabled");
        }
        driver.close();

        //Used Different Web Page for Testing isSelected Methods
        //IsSelected Conditional Methods
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        Thread.sleep(3000);
        WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println("Before Using IsSelected Method for both M&F:"+male.isSelected()+" "+female.isSelected());
        male.click();
        System.out.println("After Selecting Male:"+male.isSelected());
        driver.close();
    }
}
