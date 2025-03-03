package Selenium_With_Java.BrokenLink_ShadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenlinkExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        // 1. href="https://xyz.com"
        // 2. https://xyz.com --> Sever Status Code
        // 3. status code>=400 Broken Link or Not broken Link
        // 400 (Bad Request)
        // 404 (Not Found) → Definitely a broken link

        driver.get("https://demoqa.com/broken");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Number of Links are:"+links.size());
        int NoOfBrokenLinks=0;
        for (WebElement link : links) {
            String href = link.getAttribute("href");
            if (href==null || href.length()==0){
                System.out.println("Link is empty");
                continue;
            }
            try {
                URL url = new URL(href);
                HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
                con.connect();
                if (con.getResponseCode()>=400){
                    System.out.println("Its a Broken Link: "+href);
                    NoOfBrokenLinks++;
                }
                else{
                    System.out.println("Its Not a Broken Link: "+href);
                }
            }catch (Exception e){
                continue;
            }
        }
        System.out.println("Number of Broken Links are:"+NoOfBrokenLinks);
    }
}